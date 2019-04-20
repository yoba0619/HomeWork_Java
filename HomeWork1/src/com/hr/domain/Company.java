package com.hr.domain;

import java.util.List;

public class Company {
	private int id;
	private String name;
	private List<Employee> employees;
	public Company(int id, String name, List<Employee> employees) {
		this.id = id;
		this.name = name;
		this.employees = employees;
	}
	public int getId() {
		return id;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	public String getName() {
		return name;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
}
