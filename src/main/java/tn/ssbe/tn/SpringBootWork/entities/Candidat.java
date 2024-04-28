package tn.ssbe.tn.SpringBootWork.entities;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Candidat {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idCandidat;
	private String typeCandidat;
	private String domaine;
	private String statut;
	private String niveauExp;
	private String pays;
	private String lettreMotiv;
	private String diplome;
	private String université;
	private String langue;
	private String cv;
	private String competence;
	private String civiliter;
	
	@JsonIgnore
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
    private User user;
	
	public Candidat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Candidat(long idCandidat, String typeCandidat, String domaine, String statut, String niveauExp, String pays,
			String lettreMotiv, String diplome, String université, String langue, String cv, String competence,
			String civiliter) {
		super();
		this.idCandidat = idCandidat;
		this.typeCandidat = typeCandidat;
		this.domaine = domaine;
		this.statut = statut;
		this.niveauExp = niveauExp;
		this.pays = pays;
		this.lettreMotiv = lettreMotiv;
		this.diplome = diplome;
		this.université = université;
		this.langue = langue;
		this.cv = cv;
		this.competence = competence;
		this.civiliter = civiliter;
	}

	public long getIdCandidat() {
		return idCandidat;
	}


	public void setIdCandidat(long idCandidat) {
		this.idCandidat = idCandidat;
	}


	public String getTypeCandidat() {
		return typeCandidat;
	}


	public void setTypeCandidat(String typeCandidat) {
		this.typeCandidat = typeCandidat;
	}


	public String getDomaine() {
		return domaine;
	}


	public void setDomaine(String domaine) {
		this.domaine = domaine;
	}


	public String getStatut() {
		return statut;
	}


	public void setStatut(String statut) {
		this.statut = statut;
	}


	public String getNiveauExp() {
		return niveauExp;
	}


	public void setNiveauExp(String niveauExp) {
		this.niveauExp = niveauExp;
	}


	public String getPays() {
		return pays;
	}


	public void setPays(String pays) {
		this.pays = pays;
	}


	public String getLettreMotiv() {
		return lettreMotiv;
	}


	public void setLettreMotiv(String lettreMotiv) {
		this.lettreMotiv = lettreMotiv;
	}


	public String getDiplome() {
		return diplome;
	}


	public void setDiplome(String diplome) {
		this.diplome = diplome;
	}


	public String getUniversité() {
		return université;
	}


	public void setUniversité(String université) {
		this.université = université;
	}


	public String getLangue() {
		return langue;
	}


	public void setLangue(String langue) {
		this.langue = langue;
	}


	public String getCv() {
		return cv;
	}


	public void setCv(String cv) {
		this.cv = cv;
	}


	public String getCompetence() {
		return competence;
	}


	public void setCompetence(String competence) {
		this.competence = competence;
	}


	public String getCiviliter() {
		return civiliter;
	}


	public void setCiviliter(String civiliter) {
		this.civiliter = civiliter;
	}

	

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
	
	@Override
	public String toString() {
		return "Candidat [idCandidat=" + idCandidat + ", typeCandidat=" + typeCandidat + ", domaine=" + domaine
				+ ", statut=" + statut + ", niveauExp=" + niveauExp + ", pays=" + pays + ", lettreMotiv=" + lettreMotiv
				+ ", diplome=" + diplome + ", université=" + université + ", langue=" + langue + ", cv=" + cv
				+ ", competence=" + competence + ", civiliter=" + civiliter + ", user=" + user + "]";
	}

	
	
}
