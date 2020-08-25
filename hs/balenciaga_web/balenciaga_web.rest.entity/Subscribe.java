package balenciaga_web.rest.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@Table(name = "Subscribe")
public class Subscribe {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "inputEmail")
	private String inputEmail;
	
	public Subscribe() {

	}
	
	public Subscribe(String inputEmail) {
		this.inputEmail = inputEmail;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getInputEmail() {
		return inputEmail;
	}

	public void setInputEmail(String inputEmail) {
		this.inputEmail = inputEmail;
	}
	
	@Override
	public String toString() {
		return "Tutorial [id=" + id + ", inputEmail" + inputEmail + "]";
	}

}
