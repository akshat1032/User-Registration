package com.capgemini.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	
	//Class variable
	private static final String PATTERN_FOR_NAME = "[A-Z]{1}[a-z]{2,}$";
	private static final String PATTERN_FOR_EMAIL = "^[abc]{3}[.+-_]{0,1}[a-z0-9]*@[a-z0-9]+.(a-z.)*[a-z]{2,}";
	
	private static final Pattern GET_PATTERN = Pattern.compile(PATTERN_FOR_NAME);
	private static final Pattern GET_PATTERN_EMAIl = Pattern.compile(PATTERN_FOR_EMAIL);
	
	//Instance variables
	private String firstName;
	private String lastName;
	private String email;
	
	//Validating first name
	public void validateFirstName(String name) {
		
		this.firstName = name;
		Matcher nameMatch = GET_PATTERN.matcher(this.firstName);
		if(nameMatch.matches()) {
			System.out.println("First Name : "+this.firstName);
		} else {
			System.out.println("First name must start with cap and should contain at least 3 characters");
		}
	}
	
	//Validating last name
	public void validateLastName(String name) {
		
		this.lastName = name;
		Matcher nameMatch = GET_PATTERN.matcher(this.lastName);
		if(nameMatch.matches()) {
			System.out.println("Last name : "+this.lastName);
		} else {
			System.out.println("Last name must start with cap and should contain at least 3 characters");
		}
	}
	
	public void validateEmail(String email) {
		
		this.email = email;
		Matcher nameMatch = GET_PATTERN_EMAIl.matcher(this.email);
		if(nameMatch.matches()) {
			System.out.println("Email : "+this.email);
		} else {
			System.out.println("Invalid email");
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		UserRegistration userObject = new UserRegistration();
		
		//Local variable
		String firstName;
		String lastName;
		String email;
		
		System.out.println("Enter first name :");
		firstName = sc.next();
		System.out.println("Enter last name : ");
		lastName = sc.next();
		sc.nextLine();
		System.out.println("Enter email :");
		email = sc.nextLine();
		
		//Calling name and email validation function
		userObject.validateFirstName(firstName);
		userObject.validateLastName(lastName);
		userObject.validateEmail(email);
	}
}
