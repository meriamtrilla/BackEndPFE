package tn.ssbe.tn.SpringBootWork.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.ssbe.tn.SpringBootWork.Repository.IQuestionRepository;
import tn.ssbe.tn.SpringBootWork.entities.Question;
@Service
public class QuestionServiceImpl implements InterQuestionService {
	@Autowired
	IQuestionRepository questRep;

	@Override
	public Question addQuestion(Question question) {
		// TODO Auto-generated method stub
		return questRep.save(question);
	}
	
	
	

}
