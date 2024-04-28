package tn.ssbe.tn.SpringBootWork.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.ssbe.tn.SpringBootWork.entities.Entreprise;

@Repository
public interface IEntrepRepository extends JpaRepository<Entreprise, Long>{
	
	

}
