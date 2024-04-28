package tn.ssbe.tn.SpringBootWork.Services;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

import tn.ssbe.tn.SpringBootWork.entities.Entreprise;



public interface InterEntrepService {
	
	public Entreprise addEntreprise (Entreprise entreprise);
	
	public void deleteEntreprise (Long idEntrep);
	
	//public Entreprise updateEntreprise (Entreprise entreprise , Long idEntrep);
	
	public void uploadLogo(Long idEntrep, MultipartFile logoFile) throws IOException ;
	 
	 public void deleteLogo(Long idEntrep) ;
	 
	 public void updateLogo(Long idEntrep, MultipartFile logoFile)throws IOException ;

}
