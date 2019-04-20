package com.hr.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hr.domain.Employee;

public class HRService {
	private static final int SUCCESS=0;
	private static final int FAIL=-1;
	private Map<Integer, Employee> db = new HashMap<>();
	public void addEmployee(Employee employee) {
		db.put(employee.getId(), employee);
	}
	public int removeEmployee(int id) {
		if(db.containsKey(id)) {
			db.remove(id);
			return SUCCESS;
		}
		return FAIL;
	}
	public List<Employee> search(String firstName, String lastName){
		List<Employee> employees = new ArrayList<>();
		return employees;
	}
	
	public Employee search(int id) {
		return db.get(id);
	}
	
}
