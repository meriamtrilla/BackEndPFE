package tn.ssbe.tn.SpringBootWork.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Domaine {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	
	private long idDomaine;
	private String nomDomaine;
	
	@JsonIgnore
	@ManyToMany(mappedBy = "domaines")
    private List<Entreprise> entreprises ;
	
	
	public Domaine() {
	}
	

	public Domaine(String nomDomaine) {
		this.nomDomaine = nomDomaine;
	}
	
	
	public Domaine(long idDomaine, String nomDomaine, List<Entreprise> entreprises) {
		super();
		this.idDomaine = idDomaine;
		this.nomDomaine = nomDomaine;
		this.entreprises = entreprises;
	}


	public long getIdDomaine() {
		return idDomaine;
	}
	public void setIdDomaine(long idDomaine) {
		this.idDomaine = idDomaine;
	}
	public String getNomDomaine() {
		return nomDomaine;
	}
	public void setNomDomaine(String nomDomaine) {
		this.nomDomaine = nomDomaine;
	}
	
	public List<Entreprise> getEntreprises() {
		return entreprises;
	}

	public void setEntreprises(List<Entreprise> entreprises) {
		this.entreprises = entreprises;
	}
	
	@Override
	public String toString() {
		return "Domaine [idDomaine=" + idDomaine + ", nomDomaine=" + nomDomaine + ", entreprises=" + entreprises + "]";
	}
	
	


}
