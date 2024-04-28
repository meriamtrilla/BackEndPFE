package tn.ssbe.tn.SpringBootWork.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.ssbe.tn.SpringBootWork.Repository.ICvRepository;
import tn.ssbe.tn.SpringBootWork.entities.CV;


@Service
public class CVServiceImpl implements InterCvService {
	@Autowired
	ICvRepository cvRep;
	
	@Override
	public CV addCv(CV cv) {
		// TODO Auto-generated method stub
		return cvRep.save(cv);
	}

	@Override
	public String deletecv(long idCv) {

		// TODO Auto-generated method stub
		
		String ch="";
			
			cvRep.deleteById(idCv);
			ch="Cv successfuly deleted !!";
			return ch;
		}

	@Override
	public List<CV> addListCv(List<CV> ListCv) {
		// TODO Auto-generated method stub
		return cvRep.saveAll(ListCv);
	}


}
