package tn.ssbe.tn.SpringBootWork.Services;

import java.util.List;
import java.util.Optional;

import tn.ssbe.tn.SpringBootWork.entities.RoleUser;

public interface InterRoleUserService {

	public List<RoleUser> getAllRoles();
	
	public RoleUser getRoleById(Long idRole);
	
	public RoleUser createRole(RoleUser roleuser) ;
	
	 public RoleUser updateRole(RoleUser roleuser ,Long idRole);
	 
	 public void deleteRole(Long idRole);
	 
	 public RoleUser findById(Long roleId);
	 
	 
	 
}
