package tn.ssbe.tn.SpringBootWork.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CV {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="idCv")
	private long idCv;
	private String nom;
	private String contenu;
	

	public CV(long idCv, String nom, String contenu) {
		super();
		this.idCv = idCv;
		this.nom = nom;
		this.contenu = contenu;
	}

	public CV() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public long getIdCv() {
		return idCv;
	}

	public void setIdCv(long idCv) {
		this.idCv = idCv;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	@Override
	public String toString() {
		return "CV [idCv=" + idCv + ", nom=" + nom + ", contenu=" + contenu + "]";
	}

	
	
}
	
	
