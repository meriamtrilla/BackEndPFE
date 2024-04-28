package tn.ssbe.tn.SpringBootWork.Services;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.web.multipart.MultipartFile;

import tn.ssbe.tn.SpringBootWork.entities.Entreprise;
import tn.ssbe.tn.SpringBootWork.entities.OffreEmploi;
import tn.ssbe.tn.SpringBootWork.entities.OffreEmploiDTO;
import tn.ssbe.tn.SpringBootWork.entities.StatutOffre;



public interface InterOffreEmpService  {
	
	public OffreEmploi addOffreEmp (OffreEmploi offreEmploi);
	
	//public OffreEmploi addOffreEmploi (OffreEmploi offreEmploi , Long idEntrep);
	
	public Optional<OffreEmploi> findById(Long idOffreEmp);
	
	//public List<OffreEmploi> findByentreprise(Long id);
	
	public void deleteOffreEmp (Long idOffreEmp);
	
	public List<OffreEmploi> getAllOffresEmploi();
	
	public OffreEmploi updateOffreEmploi(OffreEmploi offreEmploi);
	
	public List<OffreEmploi> getOffresEmploiByIdRect(long idRect);
	
	//public OffreEmploi createOffreEmploiWithIds(long idRect, long idTypeOffre, OffreEmploi offreEmploi);
	
	 public OffreEmploi creerOffreEmploi(OffreEmploi offreEmploi);
	 
	 public List<OffreEmploiDTO> getAllOffresEmploiWithDetails();
	 
	 //public List<OffreEmploi> getOffresEmploiByNomOffre(String nomOffre);
	 
	 public List<OffreEmploiDTO> getOffresEmploiByNomOffre(String nomOffre) ;
	 
	 public OffreEmploi updateStatut(long idOffreEmp, StatutOffre nouveauStatut) ;
	 
	 public void updateStatut(Long idOffreEmp, StatutOffre newStatut) ;
	 
	



	  
	  


}
 