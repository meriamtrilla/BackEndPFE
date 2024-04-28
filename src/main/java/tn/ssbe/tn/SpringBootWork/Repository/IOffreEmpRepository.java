package tn.ssbe.tn.SpringBootWork.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import tn.ssbe.tn.SpringBootWork.entities.OffreEmploi;

@Repository
public interface IOffreEmpRepository extends JpaRepository<OffreEmploi, Long>{
	
	//List<OffreEmploi> findByentreprise(Entreprise entreprise);
	
	List<OffreEmploi> findByRecruteurIdRect(long idRect);

    //List<OffreEmploi> findByRecruteurEntrepriseId(long idEntrep);
	
    List<OffreEmploi> findByTypeOffreNomOffre(String nomOffre);

	
}
