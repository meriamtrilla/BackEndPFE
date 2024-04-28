package tn.ssbe.tn.SpringBootWork.entities;

import java.util.Arrays;



public class UserWithRoleDto {
	
	 private long id;
	    private String nom;
	    private String prenom;
	    private String email;
	    private String adresse;
	    private String telephone;
	    private String username;
	    private String roleName; // Le nom du rôle
	    private byte[] photoProfile;
	    private String photoProfileName;
	    
		public UserWithRoleDto() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public UserWithRoleDto(long id, String nom, String prenom, String email, String adresse, String telephone,
				String username, String roleName, byte[] photoProfile, String photoProfileName) {
			super();
			this.id = id;
			this.nom = nom;
			this.prenom = prenom;
			this.email = email;
			this.adresse = adresse;
			this.telephone = telephone;
			this.username = username;
			this.roleName = roleName;
			this.photoProfile = photoProfile;
			this.photoProfileName = photoProfileName;
		}

		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
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
		public String getRoleName() {
			return roleName;
		}
		public void setRoleName(String roleName) {
			this.roleName = roleName;
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
			return "UserWithRoleDto [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email
					+ ", adresse=" + adresse + ", telephone=" + telephone + ", username=" + username + ", roleName="
					+ roleName + ", photoProfile=" + Arrays.toString(photoProfile) + ", photoProfileName="
					+ photoProfileName + "]";
		}
	    
	    
	    

}
