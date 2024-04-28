package tn.ssbe.tn.SpringBootWork.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import tn.ssbe.tn.SpringBootWork.Services.AdminServiceImpl;
import tn.ssbe.tn.SpringBootWork.Services.UserServiceImpl;
import tn.ssbe.tn.SpringBootWork.entities.Admin;
import tn.ssbe.tn.SpringBootWork.entities.Candidat;
import tn.ssbe.tn.SpringBootWork.entities.User;

@RestController
public class AdminController {
	@Autowired
	AdminServiceImpl adminServ;
	
	@Autowired
	UserServiceImpl userService;
	
	/*@PostMapping("/addCandidatUser")
    public ResponseEntity<?> addCandidate(@RequestBody AdminDto adminDto) {
        try {
            // Créer un nouvel utilisateur avec les données du candidat
            User user = new User();
            user.setAdresse(adminDto.getAdresse());
            user.setConfirmpassword(adminDto.getConfirmpassword());
            user.setEmail(adminDto.getEmail());
            user.setNom(adminDto.getNom());
            user.setPassword(adminDto.getPassword());
            user.setPrenom(adminDto.getPrenom());
            user.setTelephone(adminDto.getTelephone());
            user.setUsername(adminDto.getUsername());
            user.setRoleUser(adminDto.getRoleUser());

            // Enregistrer l'utilisateur dans la base de données
            User savedUser = userService.addUser(user);

            // Créer un nouveau candidat avec l'utilisateur enregistré
            Admin admin = new Admin();
            
            
            // Ajouter d'autres attributs du candidat si nécessaire
            admin.setUser(savedUser);

            // Enregistrer le candidat dans la base de données
            adminServ.addadmin(admin);

            return ResponseEntity.ok("Candidat ajouté avec succès !");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Une erreur s'est produite : " + e.getMessage());
        }
    }
	
	*/

}
