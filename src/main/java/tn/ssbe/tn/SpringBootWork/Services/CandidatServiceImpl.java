package tn.ssbe.tn.SpringBootWork.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.ssbe.tn.SpringBootWork.Repository.ICandidatReposittory;
import tn.ssbe.tn.SpringBootWork.Repository.IUserRepository;
import tn.ssbe.tn.SpringBootWork.entities.Candidat;
import tn.ssbe.tn.SpringBootWork.entities.User;

@Service

public class CandidatServiceImpl implements InterCandidatService{

	@Autowired
	ICandidatReposittory candidatRep;
	
	@Autowired
	IUserRepository userRep;

	@Override
	public Candidat addCandidat(Candidat candidat) {
		// TODO Auto-generated method stub
		return candidatRep.save(candidat);
	}

	@Override
	public Candidat saveCandidatWithUser(Candidat candidat, User user) {
		// TODO Auto-generated method stub
		User savedUser = userRep.save(user);

        // Associez l'utilisateur au candidat
        candidat.setUser(savedUser);

        // Enregistrez le candidat
        return candidatRep.save(candidat);
	}

	@Override
	public Candidat findCandidateByEmail(String email) {
		// TODO Auto-generated method stub
		 return candidatRep.findByUserEmail(email);
	}

	@Override
	public Candidat addCandidatEndUser(Candidat candidat) {
		// TODO Auto-generated method stub
		 User user = candidat.getUser();
	        String email = user.getEmail();
	        
	        Candidat existingCandidate = candidatRep.findByUserEmail(email);
	        if (existingCandidate != null) {
	            throw new RuntimeException("Un candidat avec cet email existe déjà.");
	        }
	        
	        // Votre logique de validation ou de traitement supplémentaire ici
	        
	        // Enregistrer le candidat
	        return candidatRep.save(candidat);
	    }
		
	
}
