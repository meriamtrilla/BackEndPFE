package tn.ssbe.tn.SpringBootWork.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.ssbe.tn.SpringBootWork.Repository.IRecruteurRepository;
import tn.ssbe.tn.SpringBootWork.entities.Recruteur;

@Service

public class RecruteurServiceImpl implements InterRecruteurService{
	@Autowired
	IRecruteurRepository recrtRep;

	@Override
	public Recruteur addRecruteur(Recruteur recruteur) {
		// TODO Auto-generated method stub
		return recrtRep.save(recruteur) ;
	}

	@Override
	public String deleteRecruteur(Long idRect) {		
		// TODO Auto-generated method stub

				String ch="";
				
				recrtRep.deleteById(idRect);
				ch="recruteur successfuly deleted !!";
				return ch;
			
	
	}

	@Override
	public Recruteur findById(long idRect) {
		// TODO Auto-generated method stub
		 return recrtRep.findById(idRect).orElse(null);
	}

	@Override
	public Recruteur updateRecruteur(Recruteur recruteur) {
		// TODO Auto-generated method stub
		  // Vérifier si le recruteur existe dans la base de données
        if (recrtRep.existsById(recruteur.getIdRect())) {
            return recrtRep.save(recruteur);
        } else {
            // Gérer le cas où le recruteur n'existe pas dans la base de données
            // Vous pouvez choisir de lever une exception, de créer un nouveau recruteur, etc.
            return null;
        }
    }

	}

	

	



