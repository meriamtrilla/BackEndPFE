package tn.ssbe.tn.SpringBootWork.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.ssbe.tn.SpringBootWork.Services.DomaineServiceImpl;
import tn.ssbe.tn.SpringBootWork.entities.Domaine;

@RestController
public class DomaineController {
	@Autowired
	DomaineServiceImpl servDomaine;
	
	@GetMapping("getDomaineById/{idDomaine}")
	public ResponseEntity<?> getDomaineById(@PathVariable Long idDomaine) {
	        Domaine domaine = servDomaine.getdomainById(idDomaine);
	        if (domaine != null) {
	            return ResponseEntity.ok(domaine);
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }
	
	
	@PostMapping("/addDomaine")
    public ResponseEntity<Domaine> addDomaine(@RequestBody Domaine domaine) {
        Domaine nouveauDomaine = servDomaine.addDomaine(domaine);
        return new ResponseEntity<>(nouveauDomaine, HttpStatus.CREATED);
    }
	
	@GetMapping("/getDomaines")
    public List<Domaine> getDomaines() {
        return servDomaine.getDomaines();
    }
	    
}

