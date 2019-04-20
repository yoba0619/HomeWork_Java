package com.hr.fixture;

import com.hr.domain.Company;

public class CompanyFixture {
	public static Company createCompany() {
		Company company = new Company(02,"SForce", null);
		return company;
	}
}