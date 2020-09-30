package com.capgemini.userregistration;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestUserRegistration {

	@Test
	public void testFirstName() {
		
		//Happy test case
		UserRegistration userObject = new UserRegistration();
		boolean expectedOutcome = true;
		boolean actualOutcome = userObject.validateFirstName("Rohan");
		assertEquals(expectedOutcome, actualOutcome);
		
		//Sad test case
		boolean expectedOutcomeSecond = false;
		boolean actualOutcomeSecond = userObject.validateFirstName("roHan");
		assertEquals(expectedOutcomeSecond, actualOutcomeSecond);
	}
	
	@Test
	public void testLastName() {
		
		//Happy test case
		UserRegistration userObject = new UserRegistration();
		boolean expectedOutcome = true;
		boolean actualOutcome = userObject.validateLastName("Kumar");
		assertEquals(expectedOutcome, actualOutcome);
		
		//Sad test case
		boolean expectedOutcomeSecond = false;
		boolean actualOutcomeSecond = userObject.validateLastName("ku");
		assertEquals(expectedOutcomeSecond, actualOutcomeSecond);
		
	}
	
	@Test
	public void testEmail() {
		
		//Happy test case
		UserRegistration userObject = new UserRegistration();
		boolean expectedOutcome = true;
		boolean actualOutcome = userObject.validateEmail("abc100@gmail.com");
		assertEquals(expectedOutcome, actualOutcome);
		
		//Sad test case
		boolean expectedOutcomeSecond = false;
		boolean actualOutcomeSecond = userObject.validateEmail("abc@.gmail.com");
		assertEquals(expectedOutcomeSecond, actualOutcomeSecond);
	}
	
	@Test
	public void testPhoneNumber() {
		
		//Happy test case
		UserRegistration userObject = new UserRegistration();
		boolean expectedOutcome = true;
		boolean actualOutcome = userObject.validatePhoneNumber("91 9835298032");
		assertEquals(expectedOutcome, actualOutcome);
		
		//Sad test case
		boolean expectedOutcomeSecond = false;
		boolean actualOutcomeSecond = userObject.validateLastName("919472174268");
		assertEquals(expectedOutcomeSecond, actualOutcomeSecond);
	}
	
	@Test
	public void testPassword() {
		
		//Happy test case
		UserRegistration userObject = new UserRegistration();
		boolean expectedOutcome = true;
		boolean actualOutcome = userObject.validatePassword("akshat1032@A");
		assertEquals(expectedOutcome, actualOutcome);
		
		//Sad test case
		boolean expectedOutcomeSecond = false;
		boolean actualOutcomeSecond = userObject.validatePassword("aks");
		assertEquals(expectedOutcomeSecond, actualOutcomeSecond);
	}
}
