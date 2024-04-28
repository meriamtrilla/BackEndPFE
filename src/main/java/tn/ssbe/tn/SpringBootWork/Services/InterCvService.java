package tn.ssbe.tn.SpringBootWork.Services;

import java.util.List;

import tn.ssbe.tn.SpringBootWork.entities.CV;


public interface InterCvService {

	public CV addCv	(CV cv);
	
	public String deletecv(long idCv);
	
	public List<CV> addListCv(List<CV> ListCv);
}
