package tn.ssbe.tn.SpringBootWork.Services;

import tn.ssbe.tn.SpringBootWork.entities.Recruteur;

public interface InterRecruteurService {
	
	public Recruteur addRecruteur(Recruteur recruteur);
	
	public String deleteRecruteur(Long idRect);
	
	public Recruteur findById(long idRect);
	
	public Recruteur updateRecruteur(Recruteur recruteur);
	
}
