package tn.ssbe.tn.SpringBootWork.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.ssbe.tn.SpringBootWork.Services.TypeOffreServiceImpl;
import tn.ssbe.tn.SpringBootWork.entities.TypeOffre;

@RestController
public class TypeOffreController {
	
	@Autowired
	TypeOffreServiceImpl typeOffreServ;
	
	@GetMapping("/getAllTypeOffres")
    public ResponseEntity<List<TypeOffre>> getAllTypeOffres() {
        List<TypeOffre> typeOffres = typeOffreServ.getAllTypeOffres();
        return new ResponseEntity<>(typeOffres, HttpStatus.OK);
    }

}
