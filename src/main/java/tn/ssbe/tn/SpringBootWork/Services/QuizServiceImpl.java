package tn.ssbe.tn.SpringBootWork.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.ssbe.tn.SpringBootWork.Repository.IQuizRepository;
import tn.ssbe.tn.SpringBootWork.entities.Quiz;
@Service

public class QuizServiceImpl implements InterQuizService{
	@Autowired
	IQuizRepository quizRep;

	@Override
	public Quiz addQuiz(Quiz quiz) {
		// TODO Auto-generated method stub
		return quizRep.save(quiz);
	}

}
