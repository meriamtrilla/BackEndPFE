package tn.ssbe.tn.SpringBootWork.Services;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.web.multipart.MultipartFile;

import tn.ssbe.tn.SpringBootWork.entities.Candidat;
//import tn.ssbe.tn.SpringBootWork.entities.Role;
import tn.ssbe.tn.SpringBootWork.entities.User;
import tn.ssbe.tn.SpringBootWork.entities.UserRequestDto;
import tn.ssbe.tn.SpringBootWork.entities.UserWithRoleDto;

public interface InterUserService {
	
	public User addUser (User user);
	
	public List<User> addListUser(List<User> Listuser);
	
	public User findById(long iduser);
	
	//public String adduserConfPw(User user);
	
	public User updateUser(User user, Long iduser);
	
	public String deleteuser(long iduser);
	
	public List<User> getALLUsers();
	
	public Optional<User> findByUserId(long iduser) ;

	public Optional<User> findByEmail(String email, String password);
	
	public User saveUserWithCandidat(User user, Candidat candidat);
	
	public User saveUser(User user);
	
	public User updateUserWithRole(Long userId, UserRequestDto userRequestDto);
	
	public void deleteUserAndCandidat(Long iduser);
	
	public User createUser(User user) ;
	
	//public List<User> getAllUsersWithRoles() ;
	
	public List<UserWithRoleDto> getAllUsersWithRoles();
	
	public void uploadProfilePhoto(Long userId, MultipartFile photoProfile) throws IOException ;
	
	public void deleteProfilePhoto(Long userId) ;
	 
	 public void updateProfilePhoto(Long userId, MultipartFile photoProfile)throws IOException ;
}
