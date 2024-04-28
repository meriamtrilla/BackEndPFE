package tn.ssbe.tn.SpringBootWork.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.ssbe.tn.SpringBootWork.Services.QuizServiceImpl;
import tn.ssbe.tn.SpringBootWork.entities.Quiz;


@RestController
public class QuizController {
	@Autowired
	QuizServiceImpl quizServ;

	
	@PostMapping(value = "/addQuiz")
	public Quiz addQuiz(@RequestBody Quiz quiz)
	{
	
		return quizServ.addQuiz(quiz);
	}
}
