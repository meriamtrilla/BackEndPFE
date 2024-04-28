package tn.ssbe.tn.SpringBootWork.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Admin {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	
	private long idAdmin;
	
	@JsonIgnore
	@OneToOne(fetch = FetchType.LAZY)
    private User user;

	
	
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Admin(long idAdmin, User user) {
		super();
		this.idAdmin = idAdmin;
		this.user = user;
	}



	public long getIdAdmin() {
		return idAdmin;
	}



	public void setIdAdmin(long idAdmin) {
		this.idAdmin = idAdmin;
	}



	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}



	@Override
	public String toString() {
		return "Admin [idAdmin=" + idAdmin + ", user=" + user + "]";
	}
	

}
