package tn.ssbe.tn.SpringBootWork.entities;

import org.springframework.web.multipart.MultipartFile;

public class UserRequestDto {
	private Long roleId;
	private String nom;
	private String prenom;
	private String email;
	private String Username;
    private String password;
    private String role;
	private String adresse;
	private String telephone;
    private String username;
    private MultipartFile photoProfile;
    private String photoProfileName;
    
	public UserRequestDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserRequestDto(Long roleId, String nom, String prenom, String email, String username, String password,
			String role, String adresse, String telephone, String username2, MultipartFile photoProfile,
			String photoProfileName) {
		super();
		this.roleId = roleId;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		Username = username;
		this.password = password;
		this.role = role;
		this.adresse = adresse;
		this.telephone = telephone;
		username = username2;
		this.photoProfile = photoProfile;
		this.photoProfileName = photoProfileName;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	public Long getRoleId() {
		return roleId;
	}



	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}


	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public String getTelephone() {
		return telephone;
	}


	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	public MultipartFile getPhotoProfile() {
		return photoProfile;
	}


	public void setPhotoProfile(MultipartFile photoProfile) {
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
		return "UserRequestDto [roleId=" + roleId + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email
				+ ", Username=" + Username + ", password=" + password + ", role=" + role + ", adresse=" + adresse
				+ ", telephone=" + telephone + ", username=" + username + ", photoProfile=" + photoProfile
				+ ", photoProfileName=" + photoProfileName + "]";
	}
    
    

}
