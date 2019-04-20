package com.hr.client;

import java.util.Scanner;
import java.util.StringTokenizer;

import com.hr.domain.Employee;
import com.hr.service.HRService;

public class HRServiceClient {
	
	private static Employee employee;
	
	public static void main(String args[]) {
		System.out.println("Enter employee details (id, first name, last name, Role(id,name))");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		
		employee = createEmployee(line);
		HRService service=new HRService();
		service.addEmployee(employee);
		Employee e = service.search(01);
	}
	private static Employee createEmployee(String line) {
		StringTokenizer st = new StringTokenizer(line, ",");
		while(st.hasMoreTokens()) {
			return new Employee(new Integer(st.nextToken()), st.nextToken(), st.nextToken());
		}
		return null;
		}
}


