package tn.ssbe.tn.SpringBootWork.Controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import tn.ssbe.tn.SpringBootWork.Services.DomaineServiceImpl;
import tn.ssbe.tn.SpringBootWork.Services.EntrepServiceImpl;
import tn.ssbe.tn.SpringBootWork.Services.RecruteurServiceImpl;
import tn.ssbe.tn.SpringBootWork.Services.RoleUserServiceImpl;
import tn.ssbe.tn.SpringBootWork.Services.UserServiceImpl;
import tn.ssbe.tn.SpringBootWork.entities.Domaine;
import tn.ssbe.tn.SpringBootWork.entities.Entreprise;
import tn.ssbe.tn.SpringBootWork.entities.Recruteur;
import tn.ssbe.tn.SpringBootWork.entities.RecruteurDto;
import tn.ssbe.tn.SpringBootWork.entities.RoleUser;
import tn.ssbe.tn.SpringBootWork.entities.User;

@RestController
public class RecruteurController {
	@Autowired
	RecruteurServiceImpl recrutService;
	
	@Autowired
	UserServiceImpl userService;
	
	@Autowired
	RoleUserServiceImpl roleUserService;
	
	@Autowired
	DomaineServiceImpl domaineService;
	
	@Autowired
	EntrepServiceImpl entrepriseService;
	
	
	
	
	@PostMapping(value = "/addRecruteur")
	public Recruteur addRecruteur(@RequestBody Recruteur recruteur) {
		//TODO: process POST request
		
		return recrutService.addRecruteur(recruteur);
	}

	@DeleteMapping(value = "/deleteRecrt/{idRect}")
	public void deleteRecrt(@PathVariable Long idRect)

	{
		 recrutService.deleteRecruteur(idRect);
	}
	
	
	@PostMapping("/addRecruteurUser")
	public ResponseEntity<?> addRecruteur(@RequestBody RecruteurDto recruteurDto) {
	    try {
	        // Récupérer le RoleUser en fonction de l'ID passé dans RecruteurDto
	        RoleUser roleUser = roleUserService.getRoleById(recruteurDto.getIdRole());
	       // List<Domaine> domaine = domaineService.getdomainById(recruteurDto.getIdDomaine());
	        
	        // Créer un nouvel utilisateur avec les données du recruteur
	        User user = new User();
	        user.setAdresse(recruteurDto.getAdresse());
	        user.setEmail(recruteurDto.getEmail());
	        user.setNom(recruteurDto.getNom());
	        user.setPassword(recruteurDto.getPassword());
	        user.setPrenom(recruteurDto.getPrenom());
	        user.setTelephone(recruteurDto.getTelephone());
	        user.setUsername(recruteurDto.getUsername());
	        user.setRoleUser(roleUser); // Assigner le RoleUser à l'utilisateur

	        Entreprise entreprise = new Entreprise();
	        entreprise.setDescriptionEntrp(recruteurDto.getDescriptionEntrp());
	        //entreprise.setDomaines(domaine);
	        entreprise.setEmailEntrp(recruteurDto.getEmailEntrp());
	        entreprise.setEmplacement(recruteurDto.getEmplacement());
	        //entreprise.setLogoFile(recruteurDto.getLogoFile());
	        entreprise.setNomEtrp(recruteurDto.getNomEntrp());
	        entreprise.setSiteWeb(recruteurDto.getSiteWeb());
	        entreprise.setTelephoneEntrp(recruteurDto.getTelephoneEntrp());
	     // Associer les domaines à l'entreprise en fonction de l'ID de domaine fourni
	        Domaine domaine = domaineService.getdomainById(recruteurDto.getIdDomaine());
	        entreprise.getDomaines().add(domaine);
	        
	        // Enregistrer l'utilisateur dans la base de données
	        User savedUser = userService.addUser(user);

	     // Enregistrer l'entreprise dans la base de données
	        Entreprise savedEntreprise = entrepriseService.addEntreprise(entreprise);
	        
	        // Créer un nouveau recruteur avec l'utilisateur enregistré
	        Recruteur recruteur = new Recruteur();
	        
	       
	        
	        // Ajouter d'autres attributs du recruteur si nécessaire
	        recruteur.setUser(savedUser);
	        recruteur.setEntreprise(savedEntreprise);
	        
	        // Enregistrer le recruteur dans la base de données
	        recrutService.addRecruteur(recruteur);

	        return ResponseEntity.ok("Recruteur ajouté avec succès !");
	    } catch (Exception e) {
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Une erreur s'est produite : " + e.getMessage());
	    }
	}
	
	@PutMapping("/updateRecruteur/{id}")
    public ResponseEntity<Recruteur> updateRecruteur(@PathVariable long id, @RequestBody RecruteurDto recruteurDto) {
        Recruteur recruteur = recrutService.findById(id);
        if (recruteur == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        
        RoleUser roleUser = roleUserService.getRoleById(recruteurDto.getIdRole());
        Domaine domaine  = domaineService.getdomainById(recruteurDto.getIdDomaine());
        // Mettre à jour les informations du recruteur
        User user = recruteur.getUser();
        user.setNom(recruteurDto.getNom());
        user.setPrenom(recruteurDto.getPrenom());
        user.setPassword(recruteurDto.getPassword());
        user.setEmail(recruteurDto.getEmail());
        user.setAdresse(recruteurDto.getAdresse());
        user.setTelephone(recruteurDto.getTelephone());
        user.setUsername(recruteurDto.getUsername());
        user.setRoleUser(roleUser);
        
        Entreprise entreprise = recruteur.getEntreprise();
        entreprise.setNomEtrp(recruteurDto.getNomEntrp());
        entreprise.setTelephoneEntrp(recruteurDto.getTelephoneEntrp());
        entreprise.setDescriptionEntrp(recruteurDto.getDescriptionEntrp());
        entreprise.setEmplacement(recruteurDto.getEmplacement());
        //entreprise.setLogoFile(recruteurDto.getLogoFile());
        entreprise.setSiteWeb(recruteurDto.getSiteWeb());
        entreprise.setEmailEntrp(recruteurDto.getEmailEntrp());
        entreprise.setDomaines(Collections.singletonList(domaine));
       

        Recruteur updatedRecruteur = recrutService.updateRecruteur(recruteur);
        return new ResponseEntity<>(updatedRecruteur, HttpStatus.OK);
    }
}
