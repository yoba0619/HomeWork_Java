package com.hr.fixture;

import com.hr.domain.Employee;

public class EmployeeFixture {
	public static Employee createEmplyee() {
		Employee employee =new Employee(01, "Yousif", "Barnawi");
		employee.setAdress(AdressFixture.createAddress());
		employee.setRoles(RoleFixture.createRoles());
		employee.setPhoneNumber(PhoneFixture.createPhone());
		return employee;
	}

}
