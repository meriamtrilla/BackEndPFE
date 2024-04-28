package tn.ssbe.tn.SpringBootWork.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.ssbe.tn.SpringBootWork.entities.Candidat;
import tn.ssbe.tn.SpringBootWork.entities.User;


@Repository
public interface ICandidatReposittory extends JpaRepository<Candidat, Long> {
	
	
	Candidat findByUserEmail(String email);
	
	Optional<Candidat> findByUser(User user);
	
	
	
	
	
}
