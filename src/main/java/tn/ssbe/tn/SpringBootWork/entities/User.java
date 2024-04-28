package tn.ssbe.tn.SpringBootWork.entities;


import java.util.Arrays;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.JOINED)
@JsonSerialize
@CrossOrigin(origins = "http://localhost:4200")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long iduser;
	private String nom;
	private String prenom;
	private String password;
	private String email;
	private String adresse;
	@Column(length = 20)
	private String telephone;
	@Column(unique = true)
    private String username;
	@Lob
	@Column(length = 1000000)
	private byte[] photoProfile;
	
	@Column(name = "photo_profile_name")
    private String photoProfileName;
	
	// role user
	@JsonIgnore
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idRole")
    private RoleUser roleUser;
	
	/*@JsonIgnore
	@OneToMany(mappedBy = "candidats")
    private List<Candidature> candidatures;*/


	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(long iduser, String nom, String prenom, String password, String email, String adresse, String telephone,
			String username, byte[] photoProfile, String photoProfileName, RoleUser roleUser) {
		super();
		this.iduser = iduser;
		this.nom = nom;
		this.prenom = prenom;
		this.password = password;
		this.email = email;
		this.adresse = adresse;
		this.telephone = telephone;
		this.username = username;
		this.photoProfile = photoProfile;
		this.photoProfileName = photoProfileName;
		this.roleUser = roleUser;
	}

	
	public long getIduser() {
		return iduser;
	}

	public void setIduser(long iduser) {
		this.iduser = iduser;
	}

	
	public String getPhotoProfileName() {
		return photoProfileName;
	}

	public void setPhotoProfileName(String photoProfileName) {
		this.photoProfileName = photoProfileName;
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

	/*public List<Candidature> getCandidatures() {
		return candidatures;
	}

	public void setCandidatures(List<Candidature> candidatures) {
		this.candidatures = candidatures;
	}*/

	
	public RoleUser getRoleUser() {
		return roleUser;
	}

	public void setRoleUser(RoleUser roleUser) {
		this.roleUser = roleUser;
	}
	

	public byte[] getPhotoProfile() {
		return photoProfile;
	}



	public void setPhotoProfile(byte[] photoProfile) {
		this.photoProfile = photoProfile;
	}



	@Override
	public String toString() {
		return "User [iduser=" + iduser + ", nom=" + nom + ", prenom=" + prenom + ", password=" + password + ", email="
				+ email + ", adresse=" + adresse + ", telephone=" + telephone + ", username=" + username
				+ ", photoProfile=" + Arrays.toString(photoProfile) + ", photoProfileName=" + photoProfileName
				+ ", roleUser=" + roleUser + "]";
	}

		
	}

