package tn.ssbe.tn.SpringBootWork.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.ssbe.tn.SpringBootWork.Services.QuestionServiceImpl;
import tn.ssbe.tn.SpringBootWork.entities.Question;


@RestController
public class QuestionController {
	@Autowired
	QuestionServiceImpl questServ;
	
	
	@PostMapping(value = "/addQuestion")
	public Question addQuestion(@RequestBody Question question)
	{
	
		return questServ.addQuestion(question);
	}

}
