package com.example.web.jsp.model;

public class User {
	private long id;
	private String firstname;
	private String lastname;
	private String address;

	public User() {

	}

	public void setId(long id) {
		this.id = id;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public User(long id, String firstname, String lastname, String address) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.address= address;
		
	}
	public User(Long id, String firstname, String lastname, String address) {
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.address= address;
		
	}

	public long getId() {
		return id;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}


	public String getAddress() {
		return address;
	}

	public void setAddress(String addresse) {
		this.address=addresse;
	}

}
