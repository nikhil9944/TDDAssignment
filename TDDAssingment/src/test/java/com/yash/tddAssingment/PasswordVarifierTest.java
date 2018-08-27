package com.yash.tddAssingment;

import static org.junit.Assert.*;

import org.junit.Test;
import  org.mockito.Mockito;

import com.yash.tddAssingmn.PasswordVarifier;


public class PasswordVarifierTest {
	
	PasswordVarifier passwordVarifier  = new PasswordVarifier();
	
	@Test
	public void testPasswordShouldNotBeNull() {
		//Mockito.doThrow(new NullPointerException("null pass")).when(passwordVarifier.passwordValidation(null));
		assertTrue(passwordVarifier.passwordValidation("nik"));
			
		}
	

	/*@Test
	public void testPasswordMoreThan8Characters() {
		//Mockito.doThrow(new RuntimeException("null pass")).when(passwordVarifier.passwordValidation("nih"));
		assertTrue(passwordVarifier.passwordValidation("nikhi"));
	}

	

	@Test
	public void testPasswordShouldAtleastOneUpperCase() {	
		//Mockito.doThrow(new RuntimeException("invalid data")).when(passwordVarifier.passwordValidation("nnnnnRA"));
		assertTrue(passwordVarifier.passwordValidation("NIKHILRAUT"));
		
		
	}

	@Test
	public void testPasswordShouldAtleastOneLowerCase() {
		assertTrue(passwordVarifier.passwordValidation("NIKHILRAUT"));
	}

	@Test
	public void testPasswordShouldAtleastOneNumber() {
		//Mockito.doThrow(new RuntimeException("invalid data")).when(passwordVarifier.passwordValidation("nnnn1nRAnn"));
		assertTrue(passwordVarifier.passwordValidation("nikhilRraut"));
	}*/

	/*@Test
	public void checkPasswordIsNullOrNot() {
		String password = "value";
		assertTrue(passwordVarifier.passwordValidationNullTest(password));
	}*/
}