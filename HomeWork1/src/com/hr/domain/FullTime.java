package com.hr.domain;

import java.util.Date;

public class FullTime extends Employee{
	private Date start;
	private Float baseSalaryPerYear;
	private Float bonusPerYear;
	public FullTime(Date start, Float baseSalaryPerYear, Float bonusPerYear) {
		this.start = start;
		this.baseSalaryPerYear = baseSalaryPerYear;
		this.bonusPerYear = bonusPerYear;
	}
	public Date getStart() {
		return start;
	}
	public Float getBaseSalaryPerYear() {
		return baseSalaryPerYear;
	}
	public Float getBonusPerYear() {
		return bonusPerYear;
	}
	
}
