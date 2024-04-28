package tn.ssbe.tn.SpringBootWork.entities;




import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Quiz {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long idQuiz;
	private String titre;
	private String description;
	private int score;
	
	public Quiz(long idQuiz, String titre, String description, int score) {
		super();
		this.idQuiz = idQuiz;
		this.titre = titre;
		this.description = description;
		this.score = score;
		
	
	}
	public Quiz() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public long getIdQuiz() {
		return idQuiz;
	}
	public void setIdQuiz(long idQuiz) {
		this.idQuiz = idQuiz;
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
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		return "Quiz [idQuiz=" + idQuiz + ", titre=" + titre + ", description=" + description + ", score=" + score
				+ "]";
	}

	
}
