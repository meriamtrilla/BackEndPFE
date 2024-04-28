package tn.ssbe.tn.SpringBootWork.Repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import tn.ssbe.tn.SpringBootWork.entities.User;

public interface IUserRepository extends JpaRepository<User, Long>{
	
	 User findByUsername(String username);
	
	//@Query(value = "select * from user u where u.user_name like :cle%", nativeQuery = true)
	//public List<User> getUsersStartWSC(@Param ("cle") String ch);
	
	Optional<User> findByEmail(String email);
	
	//@Query("SELECT u.iduser, u.nom, u.prenom, u.password, u.email, u.adresse, u.telephone, u.username, u.roleUser.idRole FROM User u JOIN FETCH u.roleUser")
	//    List<User> findAllWithRoles();

	
}
