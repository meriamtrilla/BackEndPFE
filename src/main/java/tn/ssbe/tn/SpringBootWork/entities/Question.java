package tn.ssbe.tn.SpringBootWork.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long idQuestion;
	private String libelle;
	private String text;
	private String reponse;
	

	@ManyToOne
    @JoinColumn(name = "idQuiz")
    private Quiz quiz;
	
	



	public Question(Long idQuestion, String libelle, String text, String reponse) {
		super();
		this.idQuestion = idQuestion;
		this.libelle = libelle;
		this.text = text;
		this.reponse = reponse;
	}




	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Long getIdQuestion() {
		return idQuestion;
	}


	public void setIdQuestion(Long idQuestion) {
		this.idQuestion = idQuestion;
	}

	
	public String getLibelle() {
		return libelle;
	}


	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}


	public String getText() {
		return text;
	}


	public void setText(String text) {
		this.text = text;
	}


	public String getReponse() {
		return reponse;
	}


	public void setReponse(String reponse) {
		this.reponse = reponse;
	}


	public Quiz getQuiz() {
		return quiz;
	}




	public void setQuiz(Quiz quiz) {
		this.quiz = quiz;
	}

	@Override
	public String toString() {
		return "Question [idQuestion=" + idQuestion + ", libelle=" + libelle + ", text=" + text + ", reponse=" + reponse
				+ "]";
	}

	
}
