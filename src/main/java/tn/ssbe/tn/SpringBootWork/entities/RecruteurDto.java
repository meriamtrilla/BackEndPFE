package tn.ssbe.tn.SpringBootWork.entities;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonFormat;

public class RecruteurDto {
	
	
	private String nom;
	private String prenom;
	private String password;
	private String email;
	private String adresse;
	private String telephone;
    private String username;
    private long idRole;
    private byte[] photoProfile;
    private String photoProfileName;
 ///  
    private String nomEntrp;
	private String telephoneEntrp;
	private String descriptionEntrp;
	private String emplacement;
	private MultipartFile logoFile;
	private String logoFileName;
	private String siteWeb;
	private String emailEntrp;
	private long idDomaine;
///	
	private long idOffreEmp;
    private String titre;
    private String description;
    @Enumerated(EnumType.STRING)
    private StatutOffre statut;
    @JsonFormat(pattern = "yyyy/MM/dd")
    private Date datePublication; 
    
////
	private long idTypeOffre;
	private String nomOffre;
    
	public RecruteurDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public RecruteurDto(String nom, String prenom, String password, String email, String adresse, String telephone,
			String username, long idRole, byte[] photoProfile, String photoProfileName, String nomEntrp,
			String telephoneEntrp, String descriptionEntrp, String emplacement, MultipartFile logoFile,
			String logoFileName, String siteWeb, String emailEntrp, long idDomaine, long idOffreEmp, String titre,
			String description, StatutOffre statut, Date datePublication, long idTypeOffre, String nomOffre) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.password = password;
		this.email = email;
		this.adresse = adresse;
		this.telephone = telephone;
		this.username = username;
		this.idRole = idRole;
		this.photoProfile = photoProfile;
		this.photoProfileName = photoProfileName;
		this.nomEntrp = nomEntrp;
		this.telephoneEntrp = telephoneEntrp;
		this.descriptionEntrp = descriptionEntrp;
		this.emplacement = emplacement;
		this.logoFile = logoFile;
		this.logoFileName = logoFileName;
		this.siteWeb = siteWeb;
		this.emailEntrp = emailEntrp;
		this.idDomaine = idDomaine;
		this.idOffreEmp = idOffreEmp;
		this.titre = titre;
		this.description = description;
		this.statut = statut;
		this.datePublication = datePublication;
		this.idTypeOffre = idTypeOffre;
		this.nomOffre = nomOffre;
	}


	public String getNomEntrp() {
		return nomEntrp;
	}
	public void setNomEntrp(String nomEntrp) {
		this.nomEntrp = nomEntrp;
	}
	public String getEmplacement() {
		return emplacement;
	}
	public void setEmplacement(String emplacement) {
		this.emplacement = emplacement;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public long getIdRole() {
		return idRole;
	}
	public void setIdRole(long idRole) {
		this.idRole = idRole;
	}
	

	public String getTelephone() {
		return telephone;
	}



	public void setTelephone(String telephone) {
		this.telephone = telephone;
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

	public void setDescriptionEntrp(String descriptionEntrp) {
		this.descriptionEntrp = descriptionEntrp;
	}


	public MultipartFile getLogoFile() {
		return logoFile;
	}


	public void setLogoFile(MultipartFile logoFile) {
		this.logoFile = logoFile;
	}


	public String getLogoFileName() {
		return logoFileName;
	}


	public void setLogoFileName(String logoFileName) {
		this.logoFileName = logoFileName;
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

	public long getIdDomaine() {
		return idDomaine;
	}

	public void setIdDomaine(long idDomaine) {
		this.idDomaine = idDomaine;
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

	public StatutOffre getStatut() {
		return statut;
	}





	public void setStatut(StatutOffre statut) {
		this.statut = statut;
	}





	public Date getDatePublication() {
		return datePublication;
	}





	public void setDatePublication(Date datePublication) {
		this.datePublication = datePublication;
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
	
	public byte[] getPhotoProfile() {
		return photoProfile;
	}

	public void setPhotoProfile(byte[] photoProfile) {
		this.photoProfile = photoProfile;
	}

	public String getPhotoProfileName() {
		return photoProfileName;
	}

	public void setPhotoProfileName(String photoProfileName) {
		this.photoProfileName = photoProfileName;
	}



	@Override
	public String toString() {
		return "RecruteurDto [nom=" + nom + ", prenom=" + prenom + ", password=" + password + ", email=" + email
				+ ", adresse=" + adresse + ", telephone=" + telephone + ", username=" + username + ", idRole=" + idRole
				+ ", photoProfile=" + Arrays.toString(photoProfile) + ", photoProfileName=" + photoProfileName
				+ ", nomEntrp=" + nomEntrp + ", telephoneEntrp=" + telephoneEntrp + ", descriptionEntrp="
				+ descriptionEntrp + ", emplacement=" + emplacement + ", logoFile=" + logoFile + ", logoFileName="
				+ logoFileName + ", siteWeb=" + siteWeb + ", emailEntrp=" + emailEntrp + ", idDomaine=" + idDomaine
				+ ", idOffreEmp=" + idOffreEmp + ", titre=" + titre + ", description=" + description + ", statut="
				+ statut + ", datePublication=" + datePublication + ", idTypeOffre=" + idTypeOffre + ", nomOffre="
				+ nomOffre + "]";
	}



}
