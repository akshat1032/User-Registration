package com.capgemini.userregistration;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestUserRegistration {

	@Test
	public void testFirstName() {
		
		//Happy test case
		UserRegistration userObject = new UserRegistration();
		boolean expectedOutcome = true;
		boolean actualOutcome = true;
		try {
			actualOutcome = userObject.validateFirstName("Rohan");
		} catch (InvalidUserDetailsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(expectedOutcome, actualOutcome);
		
		//Sad test case
		boolean expectedOutcomeSecond = false;
		boolean actualOutcomeSecond = false;
		try {
			actualOutcomeSecond = userObject.validateFirstName("roHan");
		} catch (InvalidUserDetailsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(expectedOutcomeSecond, actualOutcomeSecond);
	}
	
	@Test
	public void testLastName() {
		
		//Happy test case
		UserRegistration userObject = new UserRegistration();
		boolean expectedOutcome = true;
		boolean actualOutcome = true;
		try {
			actualOutcome = userObject.validateLastName("Kumar");
		} catch (InvalidUserDetailsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(expectedOutcome, actualOutcome);
		
		//Sad test case
		boolean expectedOutcomeSecond = false;
		boolean actualOutcomeSecond = false;
		try {
			actualOutcomeSecond = userObject.validateLastName("ku");
		} catch (InvalidUserDetailsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(expectedOutcomeSecond, actualOutcomeSecond);
		
	}
	
	@Test
	public void testEmail() {
		
		//Happy test case
		UserRegistration userObject = new UserRegistration();
		boolean expectedOutcome = true;
		boolean actualOutcome = true;
		try {
			actualOutcome = userObject.validateEmail("abc100@gmail.com");
		} catch (InvalidUserDetailsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(expectedOutcome, actualOutcome);
		
		//Sad test case
		boolean expectedOutcomeSecond = false;
		boolean actualOutcomeSecond = false;
		try {
			actualOutcomeSecond = userObject.validateEmail("abc@.gmail.com");
		} catch (InvalidUserDetailsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(expectedOutcomeSecond, actualOutcomeSecond);
	}
	
	@Test
	public void testPhoneNumber() {
		
		//Happy test case
		UserRegistration userObject = new UserRegistration();
		boolean expectedOutcome = true;
		boolean actualOutcome = true;
		try {
			actualOutcome = userObject.validatePhoneNumber("91 9835298032");
		} catch (InvalidUserDetailsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(expectedOutcome, actualOutcome);
		
		//Sad test case
		boolean expectedOutcomeSecond = false;
		boolean actualOutcomeSecond = false;
		try {
			actualOutcomeSecond = userObject.validateLastName("919472174268");
		} catch (InvalidUserDetailsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(expectedOutcomeSecond, actualOutcomeSecond);
	}
	
	@Test
	public void testPassword() {
		
		//Happy test case
		UserRegistration userObject = new UserRegistration();
		boolean expectedOutcome = true;
		boolean actualOutcome = true;
		try {
			actualOutcome = userObject.validatePassword("akshat1032@A");
		} catch (InvalidUserDetailsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(expectedOutcome, actualOutcome);
		
		//Sad test case
		boolean expectedOutcomeSecond = false;
		boolean actualOutcomeSecond = false;
		try {
			actualOutcomeSecond = userObject.validatePassword("aks");
		} catch (InvalidUserDetailsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(expectedOutcomeSecond, actualOutcomeSecond);
	}
}
