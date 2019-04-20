package com.hr.fixture;

import com.hr.domain.Phone;

public class PhoneFixture {
	public static Phone createPhone() {
		Phone phoneNumber = new Phone(01, "832", "-941-2463", "+1");
		return phoneNumber;
	}
	

}
