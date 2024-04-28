package tn.ssbe.tn.SpringBootWork.entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;


@Entity
public class Entreprise {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idEntrep;
	private String nomEtrp;
	@Column(length = 20)
	private String telephoneEntrp;
	@Column(length = 500)
	private String descriptionEntrp;
	private String emplacement; 
	@Lob
	@Column(length = 1000000)
    private byte[] logoFile;
	@Column(name = "logoFile_name")
    private String logoFileName;
	
	private String siteWeb;
	private String emailEntrp;
	
	@ManyToMany
    @JoinTable(
        joinColumns = @JoinColumn(name ="idEntrep"),
        inverseJoinColumns = @JoinColumn(name = "idDomaine")
    )
	private List<Domaine> domaines =new ArrayList<>() ;

	public Entreprise() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Entreprise(long idEntrep, String nomEtrp, String telephoneEntrp, String descriptionEntrp, String emplacement,
			byte[] logoFile, String logoFileName, String siteWeb, String emailEntrp, List<Domaine> domaines) {
		super();
		this.idEntrep = idEntrep;
		this.nomEtrp = nomEtrp;
		this.telephoneEntrp = telephoneEntrp;
		this.descriptionEntrp = descriptionEntrp;
		this.emplacement = emplacement;
		this.logoFile = logoFile;
		this.logoFileName = logoFileName;
		this.siteWeb = siteWeb;
		this.emailEntrp = emailEntrp;
		this.domaines = domaines;
	}


	public long getIdEntrep() {
		return idEntrep;
	}

	public void setIdEntrep(long idEntrep) {
		this.idEntrep = idEntrep;
	}

	public String getNomEtrp() {
		return nomEtrp;
	}

	public void setNomEtrp(String nomEtrp) {
		this.nomEtrp = nomEtrp;
	}

	

	public String getTelephoneEntrp() {
		return telephoneEntrp;
	}


	public void setTelephoneEntrp(String telephoneEntrp) {
		this.telephoneEntrp = telephoneEntrp;
	}


	public String getDescriptionEntrp() {
		return descriptionEntrp;
	}

	public String getEmplacement() {
		return emplacement;
	}

	public void setEmplacement(String emplacement) {
		this.emplacement = emplacement;
	}

	public byte[] getLogoFile() {
		return logoFile;
	}




	public void setLogoFile(byte[] logoFile) {
		this.logoFile = logoFile;
	}




	public String getSiteWeb() {
		return siteWeb;
	}

	public void setSiteWeb(String siteWeb) {
		this.siteWeb = siteWeb;
	}

	public String getEmailEntrp() {
		return emailEntrp;
	}

	public void setEmailEntrp(String emailEntrp) {
		this.emailEntrp = emailEntrp;
	}

	public List<Domaine> getDomaines() {
		return domaines;
	}

	public void setDomaines(List<Domaine> domaines) {
		this.domaines = domaines;
	}

	
	
	 public void setDescriptionEntrp(String descriptionEntrp) {
	        if (descriptionEntrp != null && descriptionEntrp.length() > 500) {
	            // Tronquer la description si elle dépasse 500 caractères
	            this.descriptionEntrp = descriptionEntrp.substring(0, 500);
	        } else {
	            this.descriptionEntrp = descriptionEntrp;
	        }
	    }


	public String getLogoFileName() {
		return logoFileName;
	}


	public void setLogoFileName(String logoFileName) {
		this.logoFileName = logoFileName;
	}


	@Override
	public String toString() {
		return "Entreprise [idEntrep=" + idEntrep + ", nomEtrp=" + nomEtrp + ", telephoneEntrp=" + telephoneEntrp
				+ ", descriptionEntrp=" + descriptionEntrp + ", emplacement=" + emplacement + ", logoFile="
				+ Arrays.toString(logoFile) + ", logoFileName=" + logoFileName + ", siteWeb=" + siteWeb
				+ ", emailEntrp=" + emailEntrp + ", domaines=" + domaines + "]";
	}


	
	

}
