package com.hr.domain;

import java.util.List;

public class Employee {
	
	private int id;
	private String firstName;
	private String lastName;
	private Address Adress;
	private List<Role> roles;
	private Phone phoneNumber;
	
	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public Address getAdress() {
		return Adress;
	}

	public void setAdress(Address adress) {
		Adress = adress;
	}

	public Employee(int id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Phone getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Phone phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
