package tn.ssbe.tn.SpringBootWork.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TypeOffre {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private long idTypeOffre;
	private String nomOffre;
	
	

	public TypeOffre() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public TypeOffre(long idTypeOffre, String nomOffre, List<OffreEmploi> offresEmploi) {
		super();
		this.idTypeOffre = idTypeOffre;
		this.nomOffre = nomOffre;
		
	}



	public TypeOffre(String nomOffre) {
		super();
		this.nomOffre = nomOffre;
	}

	public long getIdTypeOffre() {
		return idTypeOffre;
	}

	public void setIdTypeOffre(long idTypeOffre) {
		this.idTypeOffre = idTypeOffre;
	}

	public String getNomOffre() {
		return nomOffre;
	}

	public void setNomOffre(String nomOffre) {
		this.nomOffre = nomOffre;
	}

	
	@Override
	public String toString() {
		return "TypeOffre [idTypeOffre=" + idTypeOffre + ", nomOffre=" + nomOffre + "]";
	}
		
	
}
