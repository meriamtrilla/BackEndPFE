package tn.ssbe.tn.SpringBootWork.Services;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import tn.ssbe.tn.SpringBootWork.Repository.ICandidatReposittory;
import tn.ssbe.tn.SpringBootWork.Repository.IRoleUserRepository;
//import tn.ssbe.tn.SpringBootWork.Repository.IRoleRepository;
import tn.ssbe.tn.SpringBootWork.Repository.IUserRepository;
import tn.ssbe.tn.SpringBootWork.entities.Candidat;
import tn.ssbe.tn.SpringBootWork.entities.Entreprise;
import tn.ssbe.tn.SpringBootWork.entities.RoleUser;
//import tn.ssbe.tn.SpringBootWork.entities.Role;
import tn.ssbe.tn.SpringBootWork.entities.User;
import tn.ssbe.tn.SpringBootWork.entities.UserRequestDto;
import tn.ssbe.tn.SpringBootWork.entities.UserWithRoleDto;
@Service
public class UserServiceImpl implements InterUserService{
	@Autowired
	IUserRepository userRep;
	//IRoleRepository roleRep;
	@Autowired
	ICandidatReposittory candidatRep;
	
	@Autowired
	IRoleUserRepository roleUserRep;

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return userRep.save(user);
	}

	@Override
	public List<User> addListUser(List<User> Listuser) {
		// TODO Auto-generated method stub
		return userRep.saveAll(Listuser);
	}


	@Override
	public User updateUser(User user, Long iduser) {
		// TODO Auto-generated method stub
		User usr=userRep.findById(iduser).get();
		
		usr.setNom(user.getNom());
		usr.setPrenom(user.getPrenom());
		usr.setEmail(user.getEmail());
		usr.setPassword(user.getPassword());
		usr.setTelephone(user.getTelephone());
		usr.setAdresse(user.getAdresse());
		usr.setUsername(user.getUsername());
		
		
		return userRep.save(usr);
	}

	@Override
	public String deleteuser(long iduser) {
		// TODO Auto-generated method stub
		
		String ch="";
		
		userRep.deleteById(iduser);
		ch="user successfuly deleted !!";
		return ch;
	}

	@Override
	public List<User> getALLUsers() {
		// TODO Auto-generated method stub
		return userRep.findAll();
	}

	

	@Override
	public Optional<User> findByEmail(String email, String password) {
		// TODO Auto-generated method stub
		Optional<User> user = userRep.findByEmail(email);
	       if (user.isPresent() && user.get().getPassword().equals(password)) {
	           return user;
	        }
			return Optional.empty();
		
	}

	@Transactional
	public User saveUserWithCandidat(User user, Candidat candidat) {
		// TODO Auto-generated method stub
		
		User savedUser = userRep.save(user);

        // Associez le candidat à l'utilisateur et enregistrez-le
        candidat.setUser(savedUser);
        candidatRep.save(candidat);
        return savedUser;
		}

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return userRep.save(user);
	}

	@Transactional
	public void deleteUserAndCandidat(Long iduser) {
		// TODO Auto-generated method stub
		
		 Optional<User> userOptional = userRep.findById(iduser);
	        if (userOptional.isPresent()) {
	            User user = userOptional.get();
	            Optional<Candidat> candidatOptional = candidatRep.findByUser(user);
	            candidatOptional.ifPresent(candidat -> {
	                candidatRep.delete(candidat);
	            });
	            userRep.delete(user);
	        } else {
	            throw new RuntimeException("Utilisateur non trouvé avec l'ID : " + iduser);
	        }
	    }
	

	public User createUser(User user) {
        // Vérification si l'utilisateur existe déjà dans la base de données
        if (userRep.findByUsername(user.getUsername()) != null) {
            throw new RuntimeException("Username already exists");
        }
        
        // Autres vérifications si nécessaires...

        // Enregistrement de l'utilisateur dans la base de données
        return userRep.save(user);
    }
	@Override
	public User findById(long iduser) {
		// TODO Auto-generated method stub
		return userRep.findById(iduser).orElseThrow();
	}

	@Override
	public Optional<User> findByUserId(long iduser) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<UserWithRoleDto> getAllUsersWithRoles() {
		// TODO Auto-generated method stub
		  List<User> users = userRep.findAll();
	        return users.stream().map(this::mapToUserWithRoleDto).collect(Collectors.toList());
	    }
	    
	    private UserWithRoleDto mapToUserWithRoleDto(User user) {
	        UserWithRoleDto dto = new UserWithRoleDto();
	        dto.setId(user.getIduser());
	        dto.setNom(user.getNom());
	        dto.setPrenom(user.getPrenom());
	        dto.setEmail(user.getEmail());
	        dto.setAdresse(user.getAdresse());
	        dto.setTelephone(user.getTelephone());
	        dto.setUsername(user.getUsername());
	        dto.setRoleName(user.getRoleUser().getNameRole()); // Récupérer le nom du rôle à partir de l'utilisateur
	        return dto;
	    }
	
	
	
	    public User updateUserWithRole(Long userId, UserRequestDto userRequestDto) {
	    	
	    	 if (userId == null) {
	    	        throw new IllegalArgumentException("L'ID de l'utilisateur est nul.");
	    	    }

	    	    if (userRequestDto.getRoleId() == null) {
	    	        throw new IllegalArgumentException("L'ID du rôle de l'utilisateur est nul.");
	    	    }

	    	    // Recherche du rôle de l'utilisateur
	    	    RoleUser role = roleUserRep.findById(userRequestDto.getRoleId())
	    	                                 .orElseThrow(() -> new EntityNotFoundException("Rôle utilisateur non trouvé avec l'ID: " + userRequestDto.getRoleId()));

	    	    // Recherche de l'utilisateur à mettre à jour
	    	    Optional<User> optionalUser = userRep.findById(userId);
	    	    if (optionalUser.isPresent()) {
	    	        User existingUser = optionalUser.get();
	    	        // Mettre à jour les propriétés de l'utilisateur avec les données du DTO
	    	        existingUser.setNom(userRequestDto.getNom());
	    	        existingUser.setPrenom(userRequestDto.getPrenom());
	    	        existingUser.setAdresse(userRequestDto.getAdresse());
	    	        existingUser.setEmail(userRequestDto.getEmail());
	    	        existingUser.setPassword(userRequestDto.getPassword());
	    	        existingUser.setUsername(userRequestDto.getUsername());
	    	        existingUser.setTelephone(userRequestDto.getTelephone());
	    	        existingUser.setRoleUser(role);
	    	        // Autres mises à jour...
	    	        // Enregistrement de l'utilisateur mis à jour dans la base de données
	    	        return userRep.save(existingUser);
	    	    } else {
	    	        throw new EntityNotFoundException("Utilisateur non trouvé avec l'ID: " + userId);
	    	    }
	    }

		@Override
		public void uploadProfilePhoto(Long userId, MultipartFile photoProfile) throws IOException {
			// TODO Auto-generated method stub
			
		        // Vérifier si le fichier est vide
		        if (photoProfile.isEmpty()) {
		            throw new IllegalArgumentException("Le fichier photo est vide");
		        }

		        try {
		            // Lire les données du fichier
		            byte[] photoBytes = photoProfile.getBytes();

		            // Enregistrer le nom du fichier
		            String photoFileName =  photoProfile.getOriginalFilename();

		            // Mettre à jour l'utilisateur avec les données de la photo de profil
		            User user = userRep.findById(userId)
		                    .orElseThrow(() -> new IllegalArgumentException("Utilisateur non trouvé avec l'ID : " + userId));
		            user.setPhotoProfile(photoBytes);
		            user.setPhotoProfileName(photoFileName);

		            // Enregistrer les modifications dans la base de données
		            userRep.save(user);
		        } catch (IOException e) {
		            throw new RuntimeException("Erreur lors de la lecture du fichier photo", e);
		        }
		    }
			
		

		@Override
		public void deleteProfilePhoto(Long userId) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void updateProfilePhoto(Long userId, MultipartFile photoProfile) throws IOException {
			// TODO Auto-generated method stub
			
		}

		}

		