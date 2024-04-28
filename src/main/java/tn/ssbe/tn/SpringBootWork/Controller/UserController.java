package tn.ssbe.tn.SpringBootWork.Controller;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import tn.ssbe.tn.SpringBootWork.Services.RoleUserServiceImpl;
//import tn.ssbe.tn.SpringBootWork.Services.RoleServiceImpl;
import tn.ssbe.tn.SpringBootWork.Services.UserServiceImpl;
import tn.ssbe.tn.SpringBootWork.entities.Candidat;
import tn.ssbe.tn.SpringBootWork.entities.RoleUser;
//import tn.ssbe.tn.SpringBootWork.entities.Role;
import tn.ssbe.tn.SpringBootWork.entities.User;
import tn.ssbe.tn.SpringBootWork.entities.UserRequestDto;
import tn.ssbe.tn.SpringBootWork.entities.UserWithRoleDto;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
	@Autowired
	UserServiceImpl userServ;
	@Autowired
	RoleUserServiceImpl roleUsrServ;
	
	
			@GetMapping(value ="/test/{name}")
			public String test(@PathVariable String name)
			{
				return "Bonjour !!!"+name;
			}
			@PostMapping(value = "/addUser")
			public User addUser(@RequestBody User user)
			{
			
				return userServ.addUser(user);
			}
			
			@PostMapping(value = "/addListUser")
			public List<User> addListUser(@RequestBody List<User> listUser)
			{
			
				return userServ.addListUser(listUser);
			}
			/*@PostMapping(value = "/adduserConfPw")
			public String adduserConfPw(@RequestBody User user)
			{	
				return userServ.adduserConfPw(user);
			}*/
			
			@PostMapping(value ="/updateUser/{iduser}")
			public ResponseEntity<User> updateUser(@RequestBody User user, @PathVariable long iduser) {
		        // Vérifier si l'utilisateur existe
		        User existingUser = userServ.findById(iduser);
		        if (existingUser == null) {
		            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		        }

		        // Mettre à jour les données de l'utilisateur
		        existingUser.setNom(user.getNom());
		        existingUser.setPrenom(user.getPrenom());
		        existingUser.setEmail(user.getEmail());
		        existingUser.setAdresse(user.getAdresse());
		        existingUser.setTelephone(user.getTelephone());

		        // Mettre à jour l'utilisateur dans la base de données
		        User updatedUser = userServ.updateUser(existingUser, iduser);
		        if (updatedUser != null) {
		            return new ResponseEntity<>(updatedUser, HttpStatus.OK);
		        } else {
		            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		        }
		    }
			@DeleteMapping(value ="/deleteuser/{iduser}")
			public String deleteuser(@PathVariable long iduser )
			{
				return userServ.deleteuser(iduser);
				
			}
			@GetMapping(value ="/getALLUsers")
			public List<User> getALLUsers()
			{
				return userServ.getALLUsers();
				
			}
			
			@PostMapping(value = "/signin")
		    public ResponseEntity<?> signIn(@RequestBody SignInRequest signInRequest) {
		        Optional<User> user = userServ.findByEmail(signInRequest.getEmail(), signInRequest.getPassword());
		        if (user.isPresent()) {
		            // L'authentification a réussi, retournez les détails de l'utilisateur
		            return ResponseEntity.ok(user);
		        } else {
		            // L'authentification a échoué, renvoyez une réponse d'erreur appropriée
		            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("L'authentification a échoué.");
		        }
		    }
			
			
			@GetMapping(value = "/getuserById/{iduser}")
		    public User getUserById(@PathVariable Long iduser ) {
		        Optional<User> userOptional = userServ.findByUserId(iduser);
		        return userOptional.orElse(null); // Vous pouvez gérer les cas où l'utilisateur n'est pas trouvé.
		    }
			
			
			@PostMapping("/with-candidat")
		    public User saveUserWithCandidat(@RequestBody User user, @RequestBody Candidat candidat) {
		        return userServ.saveUserWithCandidat(user, candidat);
		    }
			
			@DeleteMapping("deleteUserAndCandidat/{iduser}")
		    public void deleteUserAndCandidat(@PathVariable Long iduser) {
		        userServ.deleteUserAndCandidat(iduser);
		    }
			
			@PostMapping("/signup")
		    public ResponseEntity<?> signUp(@RequestBody UserRequestDto userDto) {
		        RoleUser role = roleUsrServ.getRoleById(userDto.getRoleId());
		        if (role == null) {
		            return ResponseEntity.badRequest().body("Role not found");
		        }

		        User user = new User();
		        user.setUsername(userDto.getUsername());
		        user.setEmail(userDto.getEmail());
		        user.setPassword(userDto.getPassword());
		        user.setRoleUser(role);

		        User savedUser = userServ.createUser(user);
		        return ResponseEntity.ok(savedUser);
		    }
			
			@GetMapping("/getAllUsersWithRoles")
			public List<UserWithRoleDto> getAllUsersWithRoles() {
		        return userServ.getAllUsersWithRoles();
		    }
			
			 @PostMapping("updateUserWithRole/{userId}")
			    public ResponseEntity<User> updateUserWithRole(@PathVariable Long userId, @RequestBody UserRequestDto userRequestDto) {
			        User updatedUser = userServ.updateUserWithRole(userId, userRequestDto);
			        return ResponseEntity.ok(updatedUser);
			    }


			     @PostMapping("/uploadProfilePhoto/{iduser}/photoProfile")
			     public ResponseEntity<String> uploadProfilePhoto(@PathVariable Long iduser,
			                                                      @RequestParam("photoProfile") MultipartFile photoProfile) {
			         try {
			        	 userServ.uploadProfilePhoto(iduser, photoProfile);
			        	 return ResponseEntity.ok("Photo de profil mise à jour avec succès pour l'utilisateur avec l'ID : " + iduser);
			         }  catch (IOException e) {
				            e.printStackTrace();
				            return ResponseEntity.internalServerError().build();
				        }
			     }
			 
			
}
