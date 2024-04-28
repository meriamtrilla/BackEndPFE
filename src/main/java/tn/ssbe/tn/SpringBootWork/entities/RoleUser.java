package tn.ssbe.tn.SpringBootWork.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class RoleUser {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRole;

    private String nameRole;
    
    @OneToMany(mappedBy = "roleUser")
    private List<User> users;

	public RoleUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RoleUser(Long idRole, String nameRole, List<User> users) {
		super();
		this.idRole = idRole;
		this.nameRole = nameRole;
		this.users = users;
	}

	public Long getIdRole() {
		return idRole;
	}

	public void setIdRole(Long idRole) {
		this.idRole = idRole;
	}

	public String getNameRole() {
		return nameRole;
	}

	public void setNameRole(String nameRole) {
		this.nameRole = nameRole;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "RoleUser [idRole=" + idRole + ", nameRole=" + nameRole + ", users=" + users + "]";
	}

    
    
}
