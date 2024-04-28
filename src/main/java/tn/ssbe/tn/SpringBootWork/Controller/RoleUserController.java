package tn.ssbe.tn.SpringBootWork.Controller;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.ssbe.tn.SpringBootWork.Services.RoleUserServiceImpl;
import tn.ssbe.tn.SpringBootWork.entities.RoleUser;

@RestController
public class RoleUserController {
	@Autowired
	RoleUserServiceImpl roleUserServ;
	
	@GetMapping("/getAllRoles")
    public List<RoleUser> getAllRoles() {
        return roleUserServ.getAllRoles();
    }
	
	@GetMapping("/getRoleById/{idRole}")
    public ResponseEntity<RoleUser> getRoleById(@PathVariable Long idRole) {
        RoleUser role = roleUserServ.getRoleById(idRole);
        if (role != null) {
            return ResponseEntity.ok(role);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
	
	@PostMapping("/creatRole")
    public RoleUser createRole(@RequestBody RoleUser roleUser) {
        return roleUserServ.createRole(roleUser);
    }

	@PostMapping(value ="/updateRoleUser/{idRole}")
	public RoleUser updateRoleUser(@RequestBody RoleUser roleUser,@PathVariable long idRole  )
	{
		return roleUserServ.updateRole(roleUser, idRole);
		
	}
	
	@DeleteMapping("DeleteRole/{idRole}")
    public void deleteRole(@PathVariable Long idRole) {
        roleUserServ.deleteRole(idRole);
    }

}
