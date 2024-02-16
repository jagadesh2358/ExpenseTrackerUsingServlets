package dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.UniqueConstraint;

@Entity
public class Person
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int personId;
	private String personName;
	private int personAge;
	private String personAddress;
	@Column(unique = true)
	private long personPhoneNumber;
	@Column(unique = true)
	private String personEmail;
	private String personPassword;
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public int getPersonAge() {
		return personAge;
	}
	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}
	public String getPersonAddress() {
		return personAddress;
	}
	public void setPersonAddress(String personAddress) {
		this.personAddress = personAddress;
	}
	public long getPersonPhoneNumber() {
		return personPhoneNumber;
	}
	public void setPersonPhoneNumber(long personPhoneNumber) {
		this.personPhoneNumber = personPhoneNumber;
	}
	public String getPersonEmail() {
		return personEmail;
	}
	public void setPersonEmail(String personEmail) {
		this.personEmail = personEmail;
	}
	public String getPersonPassword() {
		return personPassword;
	}
	public void setPersonPassword(String personPassword) {
		this.personPassword = personPassword;
	}
	
	
}
