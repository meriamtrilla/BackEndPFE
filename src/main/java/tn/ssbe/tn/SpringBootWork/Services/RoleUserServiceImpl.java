package tn.ssbe.tn.SpringBootWork.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.ssbe.tn.SpringBootWork.Repository.IRoleUserRepository;
import tn.ssbe.tn.SpringBootWork.entities.RoleUser;

@Service
public class RoleUserServiceImpl implements InterRoleUserService{
	@Autowired
	IRoleUserRepository roleUserRep;

	@Override
	public List<RoleUser> getAllRoles() {
		// TODO Auto-generated method stub
		return roleUserRep.findAll();
	}

	@Override
	public RoleUser getRoleById(Long idRole) {
		// TODO Auto-generated method stub
		return roleUserRep.findById(idRole).orElse(null);
	}

	@Override
	public RoleUser createRole(RoleUser roleuser) {
		// TODO Auto-generated method stub
		return roleUserRep.save(roleuser);
	}

	@Override
	public RoleUser updateRole(RoleUser roleuser, Long idRole) {
		// TODO Auto-generated method stub
		RoleUser rolusr = roleUserRep.findById(idRole).get();
		
		rolusr.setNameRole(roleuser.getNameRole());
		
		return roleUserRep.save(rolusr);
	}

	@Override
	public void deleteRole(Long idRole) {
		// TODO Auto-generated method stub
		roleUserRep.deleteById(idRole);
	}

	public RoleUser findById(Long roleId) {
		// TODO Auto-generated method stub
		return roleUserRep.findById(roleId).orElse(null);
	}


}
