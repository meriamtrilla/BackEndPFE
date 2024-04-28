package tn.ssbe.tn.SpringBootWork.Controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import tn.ssbe.tn.SpringBootWork.Services.EntrepServiceImpl;
import tn.ssbe.tn.SpringBootWork.entities.Entreprise;


@RestController
public class EntrepriseController {
	@Autowired
	EntrepServiceImpl entrpServ;
	
	
	@PostMapping(value = "/addEntreprise")
	public Entreprise addEntrep(@RequestBody Entreprise entreprise)
	{
	
		return entrpServ.addEntreprise(entreprise);
	}
	
	
	@DeleteMapping("DeleteEntrp/{idEntrep}")
    public void deleteEntreprise(@PathVariable Long idEntrep ) 
	{
        entrpServ.deleteEntreprise(idEntrep);
    }
	
	/*@PostMapping(value = "/UpdateEntrep/{idEntrep}")
	public Entreprise updateEntrp (@RequestBody Entreprise entreprise , @PathVariable Long idEntrep)
	{	
		return entrpServ.updateEntreprise(entreprise, idEntrep);
	}*/


	@PostMapping("/addEntrepriseDomaine")
    public ResponseEntity<?> addEntreprise(@RequestBody Entreprise entreprise) {
        try {
            Entreprise savedEntreprise = entrpServ.addEntreprise(entreprise);
            return ResponseEntity.ok(savedEntreprise);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Une erreur s'est produite : " + e.getMessage());
        }
    }

	
	 @PostMapping("/uploadLogo/{idEntrep}/logoFile")
     public ResponseEntity<String> uploadLogo(@PathVariable Long idEntrep, @RequestParam("logoFile") MultipartFile photoProfile) {
         try {
        	 entrpServ.uploadLogo(idEntrep, photoProfile);
        	 return ResponseEntity.ok("Photo de profil mise à jour avec succès pour l'utilisateur avec l'ID : " + idEntrep);
         }  catch (IOException e) {
	            e.printStackTrace();
	            return ResponseEntity.internalServerError().build();
	        }
     }
    
}

