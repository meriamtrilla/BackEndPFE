package tn.ssbe.tn.SpringBootWork.Services;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.ssbe.tn.SpringBootWork.Repository.IEntrepRepository;
import tn.ssbe.tn.SpringBootWork.Repository.IOffreEmpRepository;
import tn.ssbe.tn.SpringBootWork.entities.OffreEmploi;
import tn.ssbe.tn.SpringBootWork.entities.OffreEmploiDTO;
import tn.ssbe.tn.SpringBootWork.entities.StatutOffre;


@Service
public class OffreEmpServiceImpl implements InterOffreEmpService {
	@Autowired
	IOffreEmpRepository offreEmpRep;
	
	@Autowired
	IEntrepRepository entrepriseRep;

	@Override
	public OffreEmploi addOffreEmp(OffreEmploi offreEmploi) {
		// TODO Auto-generated method stub
		return offreEmpRep.save(offreEmploi);
	}

	/*@Override
	public OffreEmploi addOffreEmploi(OffreEmploi offreEmploi, Long idEntrep) {
		// TODO Auto-generated method stub
		
		Entreprise entreprise = entrepriseRep.findById(idEntrep).get();
		
		offreEmploi.setEntreprise(entreprise);
		
		return offreEmpRep.save(offreEmploi);
	}*/

	@Override
	public Optional<OffreEmploi> findById(Long idOffreEmp) {
		// TODO Auto-generated method stub
		return offreEmpRep.findById(idOffreEmp);
	}

	/*@Override
	public List<OffreEmploi> findByentreprise(Long entreprise) {
		// TODO Auto-generated method stub
		
		Entreprise entrep = entrepriseRep.findById(entreprise).orElse(null);
		return offreEmpRep.findByentreprise(entrep);
	}*/

	@Override
	public void deleteOffreEmp(Long idOffreEmp) {
		// TODO Auto-generated method stub
			offreEmpRep.deleteById(idOffreEmp);
			
			}

	@Override
	public List<OffreEmploi> getAllOffresEmploi() {
		// TODO Auto-generated method stub
		return offreEmpRep.findAll();
	}

	@Override
	public OffreEmploi updateOffreEmploi(OffreEmploi offreEmploi) {
		// TODO Auto-generated method stub
		return offreEmpRep.save(offreEmploi);
	}

	
	@Override
	public List<OffreEmploi> getOffresEmploiByIdRect(long idRect) {
		// TODO Auto-generated method stub
		return offreEmpRep.findByRecruteurIdRect(idRect);
	}

	@Override
	public OffreEmploi creerOffreEmploi(OffreEmploi offreEmploi) {
		// TODO Auto-generated method stub
		return offreEmpRep.save(offreEmploi);
	}

	@Override
	public List<OffreEmploiDTO> getAllOffresEmploiWithDetails() {
		// TODO Auto-generated method stub
		 List<OffreEmploi> offresEmploi = offreEmpRep.findAll();
	        return offresEmploi.stream()
	                .map(this::mapToDto)
	                .collect(Collectors.toList());
	    }
		private OffreEmploiDTO mapToDto(OffreEmploi offreEmploi) {
	        OffreEmploiDTO dto = new OffreEmploiDTO();
	        
	        dto.setIdOffreEmp(offreEmploi.getIdOffreEmp());
	        dto.setNomOffre(offreEmploi.getTypeOffre().getNomOffre());
	        dto.setDatePublication(offreEmploi.getDatePublication());
	        dto.setDescrpOffre(offreEmploi.getDescription());
	        dto.setLogoFile(offreEmploi.getRecruteur().getEntreprise().getLogoFile());
	        dto.setStatut(offreEmploi.getStatut());
	        dto.setEmplacement(offreEmploi.getRecruteur().getEntreprise().getEmplacement());
	        dto.setSiteWeb(offreEmploi.getRecruteur().getEntreprise().getSiteWeb());
	        dto.setTitre(offreEmploi.getTitre());
	        dto.setEmailEntrp(offreEmploi.getRecruteur().getEntreprise().getEmailEntrp());
	        dto.setNomEntrp(offreEmploi.getRecruteur().getEntreprise().getNomEtrp());
	        dto.setTelephoneEntrp(offreEmploi.getRecruteur().getEntreprise().getTelephoneEntrp());
	        dto.setNomRecruteur(offreEmploi.getRecruteur().getUser().getNom());
	        dto.setDescriptionEntrp(offreEmploi.getRecruteur().getEntreprise().getDescriptionEntrp());
	        dto.setIdTypeOffre(offreEmploi.getTypeOffre().getIdTypeOffre()); // Ajout de idTypeOffre
	        
			return dto;
		}

		@Override
		public List<OffreEmploiDTO> getOffresEmploiByNomOffre(String nomOffre) {
			// TODO Auto-generated method stub
			List<OffreEmploi> offresEmploi = offreEmpRep.findByTypeOffreNomOffre(nomOffre);
	        return offresEmploi.stream()
	            .map(this::mapToDto)
	            .collect(Collectors.toList());
	    }

	    private OffreEmploiDTO mapToOffreDto(OffreEmploi offreEmploi) {
	        OffreEmploiDTO dto = new OffreEmploiDTO();
	        
	        dto.setIdOffreEmp(offreEmploi.getIdOffreEmp());
	        dto.setNomOffre(offreEmploi.getTypeOffre().getNomOffre());
	        dto.setDatePublication(offreEmploi.getDatePublication());
	        dto.setDescrpOffre(offreEmploi.getDescription());
	        dto.setLogoFile(offreEmploi.getRecruteur().getEntreprise().getLogoFile());
	        dto.setStatut(offreEmploi.getStatut());
	        dto.setEmplacement(offreEmploi.getRecruteur().getEntreprise().getEmplacement());
	        dto.setSiteWeb(offreEmploi.getRecruteur().getEntreprise().getSiteWeb());
	        dto.setTitre(offreEmploi.getTitre());
	        dto.setEmailEntrp(offreEmploi.getRecruteur().getEntreprise().getEmailEntrp());
	        dto.setNomEntrp(offreEmploi.getRecruteur().getEntreprise().getNomEtrp());
	        dto.setTelephoneEntrp(offreEmploi.getRecruteur().getEntreprise().getTelephoneEntrp());
	        dto.setNomRecruteur(offreEmploi.getRecruteur().getUser().getNom());
	        dto.setDescriptionEntrp(offreEmploi.getRecruteur().getEntreprise().getDescriptionEntrp());
	        dto.setIdTypeOffre(offreEmploi.getTypeOffre().getIdTypeOffre());
	        
	        return dto;
	    }

		@Override
		public OffreEmploi updateStatut(long idOffreEmp, StatutOffre nouveauStatut) {
			// TODO Auto-generated method stub
			OffreEmploi offreEmploi = offreEmpRep.findById(idOffreEmp)
	                .orElseThrow(() -> new IllegalArgumentException("Offre d'emploi non trouvée avec l'ID: " + idOffreEmp));
	        
	        offreEmploi.setStatut(nouveauStatut);
	        
	        return offreEmpRep.save(offreEmploi);
		}

		@Override
		public void updateStatut(Long idOffreEmp, StatutOffre newStatut) {
			// TODO Auto-generated method stub
			 OffreEmploi offreEmploi = offreEmpRep.findById(idOffreEmp)
					 .orElseThrow(() -> new IllegalArgumentException("Offre d'emploi non trouvée avec l'ID: " + idOffreEmp));

		        // Mettre à jour le statut de l'offre
		        offreEmploi.setStatut(newStatut);
		        offreEmpRep.save(offreEmploi);
		    
		}

		
		
	/*@Override
	public OffreEmploi createOffreEmploiWithIds(long idRect, long idTypeOffre, OffreEmploi offreEmploi) {
		// TODO Auto-generated method stub
		 Recruteur recruteur = new Recruteur();
	        recruteur.setIdRect(idRect); // Supposons que vous avez une méthode setIdRect dans la classe Recruteur
	        offreEmploi.setRecruteur(recruteur);
	        
	        TypeOffre typeOffre = new TypeOffre();
	        typeOffre.setIdTypeOffre(idTypeOffre); // Supposons que vous avez une méthode setIdTypeOffre dans la classe TypeOffre
	        offreEmploi.setTypeOffre(typeOffre);
		return offreEmpRep.save(offreEmploi);
	}*/

	
		
	
}


	

