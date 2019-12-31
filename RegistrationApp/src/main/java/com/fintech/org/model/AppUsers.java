package com.fintech.org.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

@Entity
@Table(name="appusers")
public class AppUsers {
	
	
	@Id
@GeneratedValue(strategy =GenerationType.AUTO)
	private int id;
	@Pattern(regexp="^[a-zA-Z\\s]*$")
	private String firstName;
	private String email;
	@Pattern(regexp="^[a-zA-Z0-9@.\\s]*$")
	private String password;
	@Pattern(regexp="^[a-zA-Z0-9@.\\s]*$")
	private String confirmPassword;
	
	private String mobileNmber;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public String getMobileNmber() {
		return mobileNmber;
	}
	public void setMobileNmber(String mobileNmber) {
		this.mobileNmber = mobileNmber;
	}
	@Override
	public String toString() {
		return "AppUsers [id=" + id + ", firstName=" + firstName + ", email=" + email + ", password=" + password
				+ ", confirmPassword=" + confirmPassword + ", mobileNmber=" + mobileNmber + "]";
	}
	

}
