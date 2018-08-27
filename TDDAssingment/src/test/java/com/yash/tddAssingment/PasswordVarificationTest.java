package com.yash.tddAssingment;

import static org.junit.Assert.*;


import org.junit.Test;


import com.yash.tddAssingmn.PasswordVarification;

public class PasswordVarificationTest {

	PasswordVarification passwordVarification=new PasswordVarification();
	
	@Test
	public void testPasswordNotNull(){
		assertTrue(passwordVarification.checkPasswordNotNull("nkhil"));
	}
	
	@Test
	public void testPasswordGreaterThan8Characters(){
		assertTrue(passwordVarification.checkPasswordGreaterThan8Characters("nikhilraut"));
	}
	
	@Test
	public void testPasswordShouldReturnTrueWhenAtleastOneUpperCase(){
		assertTrue(passwordVarification.checkPasswordShouldAtleastOneUpperCase("niK"));
	}

	@Test
	public void testPasswordShouldReturnTrueWhenAtleastOneLowerCase(){
		assertTrue(passwordVarification.checkPasswordShouldAtleastOneLowerCase("nik"));
	}
	
	@Test
	public void testPasswordShouldReturnTrueWhenAtleastOneNumber(){
		assertTrue(passwordVarification.checkPasswordShouldAtleastOneNumber("nik123"));
	}
	@Test
	public void shouldReturnTrueWhenConditionsTrue(){	
		assertTrue(passwordVarification.varifyPassword("Nikhilraut"));		
	}
	
	@Test(expected=RuntimeException.class)
	public void shouldReturnTrueWhenConditionsNotTrue(){	
		assertTrue(passwordVarification.varifyPassword("abcd"));	
		
	}
	
}
