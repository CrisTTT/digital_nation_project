package basic;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contact {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String nume, mail, company, subject, message;
	
	public Contact() {
		super();
	}
	
	public Contact(String nume, String mail, String company, String subject, String message) {
		super();
		this.nume = nume;
		this.mail = mail;
		this.company = company;
		this.subject = subject;
		this.message = message; }
		

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	@Override
	public String toString() {
		return "nume = " + nume + " mail = " + mail + "company = " + company + "subject = " + subject + "message = " + message;
	}
}