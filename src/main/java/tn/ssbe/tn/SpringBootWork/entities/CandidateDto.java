package tn.ssbe.tn.SpringBootWork.entities;

import org.springframework.web.multipart.MultipartFile;

public class CandidateDto {
	private String civiliter;
    private String competence;
    private String cv;
    private String adresse;
    private String confirmpassword;
    private String email;
    private String nom;
    private String password;
    private String prenom;
    private String telephone;
    private String username;
    private String roleUser;
    private String typeCandidat;
	private String domaine;
	private String statut;
	private String niveauExp;
	private String pays;
	private String lettreMotiv;
	private String diplome;
	private String université;
	private String langue;
    private long idRole;
    private MultipartFile photoProfile;
    
    
	public CandidateDto() {
		super();
		// TODO Auto-generated constructor stub
	}


	public CandidateDto(String civiliter, String competence, String cv, String adresse, String confirmpassword,
			String email, String nom, String password, String prenom, String telephone, String username,
			String roleUser, String typeCandidat, String domaine, String statut, String niveauExp, String pays,
			String lettreMotiv, String diplome, String université, String langue, long idRole,
			MultipartFile photoProfile) {
		super();
		this.civiliter = civiliter;
		this.competence = competence;
		this.cv = cv;
		this.adresse = adresse;
		this.confirmpassword = confirmpassword;
		this.email = email;
		this.nom = nom;
		this.password = password;
		this.prenom = prenom;
		this.telephone = telephone;
		this.username = username;
		this.roleUser = roleUser;
		this.typeCandidat = typeCandidat;
		this.domaine = domaine;
		this.statut = statut;
		this.niveauExp = niveauExp;
		this.pays = pays;
		this.lettreMotiv = lettreMotiv;
		this.diplome = diplome;
		this.université = université;
		this.langue = langue;
		this.idRole = idRole;
		this.photoProfile = photoProfile;
	}


	public String getCiviliter() {
		return civiliter;
	}
	public void setCiviliter(String civiliter) {
		this.civiliter = civiliter;
	}
	public String getCompetence() {
		return competence;
	}
	public void setCompetence(String competence) {
		this.competence = competence;
	}
	public String getCv() {
		return cv;
	}
	public void setCv(String cv) {
		this.cv = cv;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getConfirmpassword() {
		return confirmpassword;
	}
	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
	public String getRoleUser() {
		return roleUser;
	}

	public void setRoleUser(String roleUser) {
		this.roleUser = roleUser;
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

	public long getIdRole() {
		return idRole;
	}

	public void setIdRole(long idRole) {
		this.idRole = idRole;
	}

	
	public MultipartFile getPhotoProfile() {
		return photoProfile;
	}


	public void setPhotoProfile(MultipartFile photoProfile) {
		this.photoProfile = photoProfile;
	}


	@Override
	public String toString() {
		return "CandidateDto [civiliter=" + civiliter + ", competence=" + competence + ", cv=" + cv + ", adresse="
				+ adresse + ", confirmpassword=" + confirmpassword + ", email=" + email + ", nom=" + nom + ", password="
				+ password + ", prenom=" + prenom + ", telephone=" + telephone + ", username=" + username
				+ ", roleUser=" + roleUser + ", typeCandidat=" + typeCandidat + ", domaine=" + domaine + ", statut="
				+ statut + ", niveauExp=" + niveauExp + ", pays=" + pays + ", lettreMotiv=" + lettreMotiv + ", diplome="
				+ diplome + ", université=" + université + ", langue=" + langue + ", idRole=" + idRole
				+ ", photoProfile=" + photoProfile + "]";
	}



	

	
}
