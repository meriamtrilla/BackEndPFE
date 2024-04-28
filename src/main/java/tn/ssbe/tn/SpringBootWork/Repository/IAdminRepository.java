package tn.ssbe.tn.SpringBootWork.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.ssbe.tn.SpringBootWork.entities.Admin;

@Repository
public interface IAdminRepository extends JpaRepository<Admin, Long>{
	

}
