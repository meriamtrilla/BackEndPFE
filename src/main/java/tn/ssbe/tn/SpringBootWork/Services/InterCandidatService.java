package tn.ssbe.tn.SpringBootWork.Services;

import tn.ssbe.tn.SpringBootWork.entities.Candidat;
import tn.ssbe.tn.SpringBootWork.entities.User;


public interface InterCandidatService {
	

	public Candidat addCandidat(Candidat candidat);
	
	//public Candidat addCand (Candidat candidat , Long  iduser);
	
	public Candidat saveCandidatWithUser(Candidat candidat, User user);
	
	public Candidat findCandidateByEmail(String email);
	
	public Candidat addCandidatEndUser(Candidat candidat);
	
}
