package tn.ssbe.tn.SpringBootWork.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Recruteur {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long idRect;
	
	
	@ManyToOne
    @JoinColumn(name = "idEntrep")
    private Entreprise entreprise;
	
	@JsonIgnore
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
    private User user;
	
	public Recruteur() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Recruteur(long idRect, Entreprise entreprise, User user) {
		super();
		this.idRect = idRect;
		this.entreprise = entreprise;
		this.user = user;
	}


	public long getIdRect() {
		return idRect;
	}

	public void setIdRect(long idRect) {
		this.idRect = idRect;
	}


	public Entreprise getEntreprise() {
		return entreprise;
	}

	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Recruteur [idRect=" + idRect + ", entreprise=" + entreprise + ", user=" + user + "]";
	}

	

}