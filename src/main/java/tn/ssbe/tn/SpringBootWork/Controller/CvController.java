package tn.ssbe.tn.SpringBootWork.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.ssbe.tn.SpringBootWork.Services.InterCvService;
import tn.ssbe.tn.SpringBootWork.entities.CV;



@RestController

public class CvController {
	@Autowired
	InterCvService cvServ;
	
	@PostMapping(value = "/addCv")
	public CV addCv(@RequestBody CV cv)
	{
	
		return cvServ.addCv(cv);
	}
	
	@DeleteMapping(value ="/deleteCv/{idCv}")
	public String deleteCV(@PathVariable long idCv )
	{
		return cvServ.deletecv(idCv);
		
	}
	
	@PostMapping(value = "/addListCV")
	public List<CV> addListCV(@RequestBody List<CV> addListCV)
	{
	
		return cvServ.addListCv(addListCV);
	}
	
	

}
