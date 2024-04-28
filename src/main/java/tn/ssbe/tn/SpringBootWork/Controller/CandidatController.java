package tn.ssbe.tn.SpringBootWork.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.ssbe.tn.SpringBootWork.Services.CandidatServiceImpl;
import tn.ssbe.tn.SpringBootWork.Services.RoleUserServiceImpl;
import tn.ssbe.tn.SpringBootWork.Services.UserServiceImpl;
import tn.ssbe.tn.SpringBootWork.entities.Candidat;
import tn.ssbe.tn.SpringBootWork.entities.CandidateDto;
import tn.ssbe.tn.SpringBootWork.entities.RoleUser;
import tn.ssbe.tn.SpringBootWork.entities.User;



@RestController
public class CandidatController {
	@Autowired
	CandidatServiceImpl candidatServ;
	
	@Autowired
	UserServiceImpl userService;
	
	@Autowired
	RoleUserServiceImpl roleUserService;
	
	@PostMapping(value = "/addCandidat")
	public Candidat addCandidat(@RequestBody  Candidat candidat ){
		//TODO: process POST request
		return candidatServ.addCandidat(candidat);		
	}
	@PostMapping("/with-user")
    public Candidat saveCandidatWithUser(@RequestBody Candidat candidat, @RequestBody User user) {
		User savedUser = userService.addUser(user);
        return candidatServ.saveCandidatWithUser(candidat, user);
    }
	
	////////
	
	@GetMapping("/findCandidateByEmail/{email}")
    public ResponseEntity<?> getCandidateByEmail(@PathVariable String email) {
        try {
            Candidat candidat = candidatServ.findCandidateByEmail(email);
            if (candidat != null) {
                return ResponseEntity.ok(candidat);
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Une erreur s'est produite : " + e.getMessage());
        }
    }
	
	
	///////
	
	
	@PostMapping("/addCandidatUser")
    public ResponseEntity<?> addCandidate(@RequestBody CandidateDto candidateDto) {
        try {
        	RoleUser roleUser = roleUserService.getRoleById(candidateDto.getIdRole());
            // Créer un nouvel utilisateur avec les données du candidat
            User user = new User();
            user.setAdresse(candidateDto.getAdresse());
            user.setEmail(candidateDto.getEmail());
            user.setNom(candidateDto.getNom());
            user.setPassword(candidateDto.getPassword());
            user.setPrenom(candidateDto.getPrenom());
            user.setTelephone(candidateDto.getTelephone());
            user.setUsername(candidateDto.getUsername());
            user.setRoleUser(roleUser);
            
           

            // Enregistrer l'utilisateur dans la base de données
            User savedUser = userService.addUser(user);
           // RoleUser roleUser = roleUserService.getRoleById(candidateDto.getIdRole());
            
            // Créer un nouveau candidat avec l'utilisateur enregistré
            Candidat candidat = new Candidat();
            candidat.setCiviliter(candidateDto.getCiviliter());
            candidat.setCompetence(candidateDto.getCompetence());
            candidat.setCv(candidateDto.getCv());
            candidat.setDiplome(candidateDto.getDiplome());
            candidat.setDomaine(candidateDto.getDomaine());
            candidat.setLangue(candidateDto.getLangue());
            candidat.setLettreMotiv(candidateDto.getLettreMotiv());
            candidat.setNiveauExp(candidateDto.getNiveauExp());
            candidat.setPays(candidateDto.getPays());
            candidat.setStatut(candidateDto.getStatut());
            candidat.setTypeCandidat(candidateDto.getTypeCandidat());
            candidat.setUniversité(candidateDto.getUniversité());
           
            
            // Ajouter d'autres attributs du candidat si nécessaire
            candidat.setUser(savedUser);
           // candidat.setRoleUser(roleUser);
            // Enregistrer le candidat dans la base de données
            candidatServ.addCandidat(candidat);

            return ResponseEntity.ok("Candidat ajouté avec succès !");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Une erreur s'est produite : " + e.getMessage());
        }
    }
	
}