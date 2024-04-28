package tn.ssbe.tn.SpringBootWork.entities;

import java.util.Arrays;
import java.util.Date;

import org.springframework.web.multipart.MultipartFile;


public class OffreEmploiDTO {

	private long idOffreEmp;
    private String titre;
    private String descrpOffre;
    private StatutOffre statut;
    private Date datePublication; 
    
    private String nomRecruteur;
////
    private Long idTypeOffre;
	private String nomOffre; //type stage ou Emploi
	
///
	 private String nomEntrp;
		private String telephoneEntrp;
		private String descriptionEntrp;
		private String emplacement;
		 private byte[] logoFile;
		private String siteWeb;
		private String emailEntrp;
		private long idDomaine;      
		
/////
		
		private String nomDomaine;

		public OffreEmploiDTO() {
			super();
			// TODO Auto-generated constructor stub
		}



		public OffreEmploiDTO(long idOffreEmp, String titre, String descrpOffre, StatutOffre statut,
				Date datePublication, String nomRecruteur, Long idTypeOffre, String nomOffre, String nomEntrp,
				String telephoneEntrp, String descriptionEntrp, String emplacement, byte[] logoFile, String siteWeb,
				String emailEntrp, long idDomaine, String nomDomaine) {
			super();
			this.idOffreEmp = idOffreEmp;
			this.titre = titre;
			this.descrpOffre = descrpOffre;
			this.statut = statut;
			this.datePublication = datePublication;
			this.nomRecruteur = nomRecruteur;
			this.idTypeOffre = idTypeOffre;
			this.nomOffre = nomOffre;
			this.nomEntrp = nomEntrp;
			this.telephoneEntrp = telephoneEntrp;
			this.descriptionEntrp = descriptionEntrp;
			this.emplacement = emplacement;
			this.logoFile = logoFile;
			this.siteWeb = siteWeb;
			this.emailEntrp = emailEntrp;
			this.idDomaine = idDomaine;
			this.nomDomaine = nomDomaine;
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

		public String getDescrpOffre() {
			return descrpOffre;
		}



		public void setDescrpOffre(String descrpOffre) {
			this.descrpOffre = descrpOffre;
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

		public String getNomRecruteur() {
			return nomRecruteur;
		}

		public void setNomRecruteur(String nomRecruteur) {
			this.nomRecruteur = nomRecruteur;
		}

		public String getNomOffre() {
			return nomOffre;
		}

		public void setNomOffre(String nomOffre) {
			this.nomOffre = nomOffre;
		}

		public String getNomEntrp() {
			return nomEntrp;
		}

		public void setNomEntrp(String nomEntrp) {
			this.nomEntrp = nomEntrp;
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

		
		public Long getIdTypeOffre() {
			return idTypeOffre;
		}


		public void setIdTypeOffre(Long idTypeOffre) {
			this.idTypeOffre = idTypeOffre;
		}


		@Override
		public String toString() {
			return "OffreEmploiDTO [idOffreEmp=" + idOffreEmp + ", titre=" + titre + ", descrpOffre=" + descrpOffre
					+ ", statut=" + statut + ", datePublication=" + datePublication + ", nomRecruteur=" + nomRecruteur
					+ ", idTypeOffre=" + idTypeOffre + ", nomOffre=" + nomOffre + ", nomEntrp=" + nomEntrp
					+ ", telephoneEntrp=" + telephoneEntrp + ", descriptionEntrp=" + descriptionEntrp + ", emplacement="
					+ emplacement + ", logoFile=" + Arrays.toString(logoFile) + ", siteWeb=" + siteWeb + ", emailEntrp="
					+ emailEntrp + ", idDomaine=" + idDomaine + ", nomDomaine=" + nomDomaine + "]";
		}


		

}
