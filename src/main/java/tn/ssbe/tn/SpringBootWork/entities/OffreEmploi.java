package tn.ssbe.tn.SpringBootWork.entities;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity

public class OffreEmploi {
	@Id
	@GeneratedValue ( strategy = GenerationType.IDENTITY)
	private long idOffreEmp;
    private String titre;
    @Column(length = 500)
    private String description;
    @Enumerated(EnumType.STRING)
    private StatutOffre statut;
    @JsonFormat(pattern = "yyyy/MM/dd")
    private Date datePublication; 
  ////
        @ManyToOne
        @JoinColumn(name = "idRect") // Nom de la colonne de la clé étrangère dans la table OffreEmploi
        private Recruteur recruteur;
 ///
        @ManyToOne
        @JoinColumn(name = "idTypeOffre")
        private TypeOffre typeOffre;
        
        

	
		public OffreEmploi(long idOffreEmp, String titre, String description, StatutOffre statut, Date datePublication,
			Recruteur recruteur, TypeOffre typeOffre) {
		super();
		this.idOffreEmp = idOffreEmp;
		this.titre = titre;
		this.description = description;
		this.statut = statut;
		this.datePublication = datePublication;
		this.recruteur = recruteur;
		this.typeOffre = typeOffre;
	}
	

	/*@JsonIgnore
	@OneToMany(mappedBy = "candidats")
    private List<Candidature> candidatures = new ArrayList<>();*/
	
	/*@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idEntrep")
	private Entreprise entreprise;*/

	


	public OffreEmploi() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public long getIdOffreEmp() {
		return idOffreEmp;
	}

	public void setIdOffreEmp(long idOffreEmp) {
		this.idOffreEmp = idOffreEmp;
	}

	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Date getDatePublication() {
		return datePublication;
	}
	public void setDatePublication(Date datePublication) {
		this.datePublication = datePublication;
	}
	
	

	/*public List<Candidature> getCandidatures() {
		return candidatures;
	}


	public void setCandidatures(List<Candidature> candidatures) {
		this.candidatures = candidatures;
	}*/


	/*public Entreprise getEntreprise() {
		return entreprise;
	}


	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}*/
	
		

	public Recruteur getRecruteur() {
		return recruteur;
	}


	public StatutOffre getStatut() {
		return statut;
	}


	public void setStatut(StatutOffre statut) {
		this.statut = statut;
	}


	public void setRecruteur(Recruteur recruteur) {
		this.recruteur = recruteur;
	}


	public TypeOffre getTypeOffre() {
		return typeOffre;
	}


	public void setTypeOffre(TypeOffre typeOffre) {
		this.typeOffre = typeOffre;
	}


	@Override
	public String toString() {
		return "OffreEmploi [idOffreEmp=" + idOffreEmp + ", titre=" + titre + ", description=" + description
				+ ", statut=" + statut + ", datePublication=" + datePublication + ", recruteur=" + recruteur
				+ ", typeOffre=" + typeOffre + "]";
	}
    
    

}
