package com.capgemini.userregistration;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class TestUserEmail {

	private String sampleEmail;
	private boolean expectedOutcome;
	private UserRegistration userEmail;
	
	public TestUserEmail(String sampleEmail, boolean expectedOutcome) {
		super();
		this.sampleEmail = sampleEmail;
		this.expectedOutcome = expectedOutcome;
	}
	
	@Before
	public void initializeObject() {
		
		userEmail = new UserRegistration();
	}
	
	@Parameterized.Parameters
	public static Collection inputSampleEmail() {
		
		return Arrays.asList(new Object[][] {{"abc@yahoo.com", true},{"abc-100@yahoo.com", true},{"abc.100@yahoo.com", true},{"abc111@abc.com", true},{"abc-100@abc.net", true},{"abc.100@abc.com.au", true},{"abc@1.com", true},{"abc@gmail.com.com", true},{"abc+100@gmail.com", true}});
	}
	
	@Test
	public void testUserEmail() {
		
		try {
			assertEquals(expectedOutcome,userEmail.validateEmail(sampleEmail));
		} catch (InvalidUserDetailsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
