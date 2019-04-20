package com.hr.domain;

import java.util.Date;

public class Contractor extends Employee {
	private Date start;
	private Date end;
	private Float hourlyRate;
	public Contractor(Date start, Date end, Float hourlyRate) {
		this.start = start;
		this.end = end;
		this.hourlyRate = hourlyRate;
	}
	public Date getStart() {
		return start;
	}
	public Date getEnd() {
		return end;
	}
	public Float getHourlyRate() {
		return hourlyRate;
	}
	

}
