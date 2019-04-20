package com.hr.fixture;

import com.hr.domain.Address;

public class AdressFixture {
	public static Address createAddress() {
		
		Address address = new Address(01,"80303","United States","Colorado","Boulder","700 Mohawk","202");
		return address;
		
	}

}
