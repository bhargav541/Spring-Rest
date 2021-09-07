package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name="Employ")
public class Employ {
	
	
	@Id
	
	private Long id;
	
	@Column(name="FIRSTNAME")
	private String firstName;
	
	
	@Column(name="LASTNAME")
	private String lastName;

	
	@Column(name="EMAILID")
	private String emailId;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	@Override
	public String toString() {
		return "Employ [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId
				+ "]";
	}
	
	

}
