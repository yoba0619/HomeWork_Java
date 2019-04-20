package com.hr.service;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import com.hr.domain.Employee;
import com.hr.fixture.EmployeeFixture;

public class HRServiceTest {
	
	private HRService service;
	@Before
	public void setup() {
		service = new HRService();
	}
	@Test
	public void addEmployeeTest() {
		
		Employee employee = service.search(01);	
		assertNull(employee);
		service.addEmployee(EmployeeFixture.createEmplyee());
		service.removeEmployee(02);
		service.removeEmployee(01);
		service.search("Yousif", "Barnawi");
		service.search("Yousif", "Ba");
		assertNotNull(employee);
		assertEquals("Yousif", employee.getFirstName());
		
	}
}
