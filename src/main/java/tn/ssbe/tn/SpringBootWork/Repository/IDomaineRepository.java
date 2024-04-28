package tn.ssbe.tn.SpringBootWork.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.ssbe.tn.SpringBootWork.entities.Domaine;
@Repository
public interface IDomaineRepository extends JpaRepository<Domaine, Long> {

}
