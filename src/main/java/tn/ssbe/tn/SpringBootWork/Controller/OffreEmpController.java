package tn.ssbe.tn.SpringBootWork.Controller;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
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

import tn.ssbe.tn.SpringBootWork.Services.InterOffreEmpService;
import tn.ssbe.tn.SpringBootWork.entities.OffreEmploi;
import tn.ssbe.tn.SpringBootWork.entities.OffreEmploiDTO;
import tn.ssbe.tn.SpringBootWork.entities.StatutOffre;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class OffreEmpController {
	
	@Autowired
	InterOffreEmpService offreEmpServ;
	
	@PostMapping(value = "/addOffreEmploi")
	public OffreEmploi addOffreEmploi(@RequestBody OffreEmploi offreEmploi )
	{
	
		return offreEmpServ.addOffreEmp(offreEmploi);
	}
	
	/*@PostMapping(value = "/addOffEmploi/{idEntrep}")
	public OffreEmploi addOffEmploi(@RequestBody OffreEmploi offreEmploi , @PathVariable Long idEntrep )
	{
	
		return offreEmpServ.addOffreEmploi(offreEmploi, idEntrep);
	}*/
	
	@GetMapping(value = "/getOffreEmpWID/{idOffreEmp}")
	public Optional<OffreEmploi> getOffreEmpWID(@PathVariable Long idOffreEmp)
	{
		return offreEmpServ.findById(idOffreEmp);
	}
	
	 /*@GetMapping("/getOffreWEntrp/{idEntrep}")
	 public List<OffreEmploi> getCandWEntrp(@PathVariable Long idEntrep)
	 {
		
		return offreEmpServ.findByentreprise(idEntrep);
		 
	 }*/
	 
	 @DeleteMapping("/DeleteOffEmp/{idOffreEmp}")
	    public void deleteOffreEmp(@PathVariable Long idOffreEmp ) 
		{
	        offreEmpServ.deleteOffreEmp(idOffreEmp);
	    }
	 

	 @GetMapping("/getAllOffresEmp")
	    public List<OffreEmploi> getAllOffresEmploi() {
	        return offreEmpServ.getAllOffresEmploi();
	    }
	
	 @PutMapping("/updateOffreEmp")
	    public OffreEmploi updateOffreEmploi(@RequestBody OffreEmploi offreEmploi) {
	        return offreEmpServ.updateOffreEmploi(offreEmploi);
	    } 
	 
	 @GetMapping("/getOffresEmpByRectId/{idRect}")
	    public List<OffreEmploi> getOffresEmploiByRecruteurId(@PathVariable long idRect) {
	        return offreEmpServ.getOffresEmploiByIdRect(idRect);
	  }
	 
	 @PostMapping("/createOffreEmploiWithIds")
	 public ResponseEntity<String> creerOffreEmploi(@RequestBody OffreEmploi offreEmploi) {
	        if (offreEmploi.getRecruteur() == null || offreEmploi.getTypeOffre() == null) {
	            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Recruteur et/ou type d'offre manquant(s)");
	        }

	        // Appel au service pour créer l'offre d'emploi
	        offreEmpServ.creerOffreEmploi(offreEmploi);

	        return ResponseEntity.status(HttpStatus.CREATED).body("Offre d'emploi créée avec succès");
	    }
	 
	 @GetMapping("/getAllOffresEmploiWithDetails")
	 public List<OffreEmploiDTO> getAllOffresEmploiWithDetails() {
	        return offreEmpServ.getAllOffresEmploiWithDetails();
	    }
	 
	 @GetMapping("/getOffresEmploiByNomOffre/{nomOffre}")
	    public List<OffreEmploiDTO> getOffresEmploiByNomOffre(@PathVariable String nomOffre) {
	        return offreEmpServ.getOffresEmploiByNomOffre(nomOffre);
	    }
	 
	 @PostMapping("/updateStatut/{idOffreEmp}/statut")
	    public ResponseEntity<OffreEmploi> updateStatut(@PathVariable long idOffreEmp, @RequestBody StatutOffre nouveauStatut) {
	        OffreEmploi updatedOffreEmploi = offreEmpServ.updateStatut(idOffreEmp, nouveauStatut);
	        return new ResponseEntity<>(updatedOffreEmploi, HttpStatus.OK);
	    }
	 
	 @PutMapping("/updateStatutOff/{idOffreEmp}/{newStatut}")
	    public ResponseEntity<?> updateStatut(@PathVariable("idOffreEmp") Long idOffreEmp, @PathVariable("newStatut") StatutOffre newStatut) {
	        try {
	            offreEmpServ.updateStatut(idOffreEmp, newStatut);
	            return new ResponseEntity<>("Statut de l'offre mis à jour avec succès.", HttpStatus.OK);
	        } catch (ConfigDataResourceNotFoundException e) {
	            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
	        } catch (Exception e) {
	            return new ResponseEntity<>("Erreur lors de la mise à jour du statut de l'offre.", HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }
	 
	
}
