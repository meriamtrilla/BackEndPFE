package tn.ssbe.tn.SpringBootWork.Services;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import tn.ssbe.tn.SpringBootWork.Repository.IEntrepRepository;
import tn.ssbe.tn.SpringBootWork.entities.Entreprise;
import tn.ssbe.tn.SpringBootWork.entities.User;


@Service
public class EntrepServiceImpl  implements InterEntrepService {
	@Autowired
	IEntrepRepository entrepRep;

	@Override
	public Entreprise addEntreprise(Entreprise entreprise) {
		// TODO Auto-generated method stub
		return entrepRep.save(entreprise);
	}

	@Override
	public void deleteEntreprise(Long idEntrep) {
		// TODO Auto-generated method stub
		entrepRep.deleteById(idEntrep);
		}

	@Override
	public void uploadLogo(Long idEntrep, MultipartFile logoFile) throws IOException {
		// TODO Auto-generated method stub

        // Vérifier si le fichier est vide
        if (logoFile.isEmpty()) {
            throw new IllegalArgumentException("Le fichier photo est vide");
        }

        try {
            // Lire les données du fichier
            byte[] photoBytes = logoFile.getBytes();

            // Enregistrer le nom du fichier
            String photoFileName =  logoFile.getOriginalFilename();

            // Mettre à jour l'utilisateur avec les données de la photo de profil
            Entreprise entreprise  = entrepRep.findById(idEntrep)
                    .orElseThrow(() -> new IllegalArgumentException("Entreprise non trouvé avec l'ID : " + idEntrep));
            entreprise.setLogoFile(photoBytes);
            entreprise.setLogoFileName(photoFileName);

            // Enregistrer les modifications dans la base de données
            entrepRep.save(entreprise);
        } catch (IOException e) {
            throw new RuntimeException("Erreur lors de la lecture du fichier photo", e);
        }
    }
	

	@Override
	public void deleteLogo(Long idEntrep) {
		// TODO Auto-generated method stub
		 Entreprise entreprise = entrepRep.findById(idEntrep).orElseThrow(() -> new IllegalArgumentException("Entreprise not found with id: " + idEntrep));
	        entreprise.setLogoFile(null);
	        entrepRep.save(entreprise);
	    }
		
	

	@Override
	public void updateLogo(Long idEntrep, MultipartFile logoFile) throws IOException {
		// TODO Auto-generated method stub
		
		 Entreprise entreprise = entrepRep.findById(idEntrep)
	                .orElseThrow(() -> new IllegalArgumentException("Entreprise non trouvée avec l'identifiant : " + idEntrep));

	        entreprise.setLogoFile(logoFile.getBytes());
	        entrepRep.save(entreprise);
	    }
	
		
	

	/*@Override
	public Entreprise updateEntreprise(Entreprise entreprise, Long idEntrep) {
		// TODO Auto-generated method stub
		Entreprise entrp= entrepRep.findById(idEntrep).get();
		
		entrp.setAdresse(entreprise.getAdresse());
		entrp.setDomaine(entreprise.getDomaine());
		entrp.setNom(entreprise.getNom());
		entrp.setTelephone(entreprise.getTelephone());
		
		return entrepRep.save(entrp);
	}*/
		
	
	
	}

	
	
	
	
	


