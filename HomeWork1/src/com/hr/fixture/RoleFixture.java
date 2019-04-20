package com.hr.fixture;

import java.util.ArrayList;
import java.util.List;

import com.hr.domain.Role;

public class RoleFixture {
	
	public static List<Role> createRoles(){
		List<Role> roles = new ArrayList<>();
		roles.add(new Role(01,"Software Engineer"));
		roles.add(new Role(02,"Front-End Developer"));
		return roles;
	}

}
