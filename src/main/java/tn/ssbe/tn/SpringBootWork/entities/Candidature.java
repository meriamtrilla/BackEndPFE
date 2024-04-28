package tn.ssbe.tn.SpringBootWork.entities;



import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Candidature {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idCand;
	@JsonFormat(pattern = "yyyy/MM/dd")
	private Date date;
	private String Statut;


	


	public Candidature(long idCand, Date date, String statut) {
		super();
		this.idCand = idCand;
		this.date = date;
		Statut = statut;
	}

	/*@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "iduser")
    private User candidats;*/
	
	/*@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idOffreEmp")
	private OffreEmploi offreEmploi;*/


	

	


	public Candidature() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public long getIdCand() {
		return idCand;
	}

	public void setIdCand(long idCand) {
		this.idCand = idCand;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getStatut() {
		return Statut;
	}

	public void setStatut(String statut) {
		Statut = statut;
	}
	
	/*public User getCandidats() {
		return candidats;
	}



	public void setCandidats(User candidats) {
		this.candidats = candidats;
	}*/


	/*public OffreEmploi getOffreEmploi() {
		return offreEmploi;
	}



	public void setOffreEmploi(OffreEmploi offreEmploi) {
		this.offreEmploi = offreEmploi;
	}*/

	
	@Override
	public String toString() {
		return "Candidature [idCand=" + idCand + ", date=" + date + ", Statut=" + Statut + "]";
	}



}
