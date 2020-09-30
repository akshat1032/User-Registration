package com.capgemini.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	
	//Class variable
	private static final String PATTERN_FOR_NAME = "[A-Z]{1}[a-z]{2,}$";
	private static final String PATTERN_FOR_EMAIL = "^[abc]{3}[.+-_]{0,1}[a-z0-9]*@[a-z0-9]+.(a-z.)*[a-z]{2,}";
	private static final String PATTERN_FOR_PHNO = "^[0-9]{1,3}\s{1}[0-9]*{10}";
	private static final String PATTERN_FOR_PASSWORD = "[A-Za-z0-9]*{8,}";
	
	//Developing required patterns
	private static final Pattern GET_PATTERN_NAME = Pattern.compile(PATTERN_FOR_NAME);
	private static final Pattern GET_PATTERN_EMAIL = Pattern.compile(PATTERN_FOR_EMAIL);
	private static final Pattern GET_PATTERN_PHNO = Pattern.compile(PATTERN_FOR_PHNO);
	private static final Pattern GET_PATTERN_PWD = Pattern.compile(PATTERN_FOR_PASSWORD);
	
	//Instance variables
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private String password;
	
	//Validating first name
	public void validateFirstName(String name) {
		
		this.firstName = name;
		Matcher nameMatch = GET_PATTERN_NAME.matcher(this.firstName);
		if(nameMatch.matches()) {
			System.out.println("First Name : "+this.firstName);
		} else {
			System.out.println("First name must start with cap and should contain at least 3 characters");
		}
	}
	
	//Validating last name
	public void validateLastName(String name) {
		
		this.lastName = name;
		Matcher nameMatch = GET_PATTERN_NAME.matcher(this.lastName);
		if(nameMatch.matches()) {
			System.out.println("Last name : "+this.lastName);
		} else {
			System.out.println("Last name must start with cap and should contain at least 3 characters");
		}
	}
	
	//Validating email
	public void validateEmail(String email) {
		
		this.email = email;
		Matcher nameMatch = GET_PATTERN_EMAIL.matcher(this.email);
		if(nameMatch.matches()) {
			System.out.println("Email : "+this.email);
		} else {
			System.out.println("Invalid email");
		}
	}
	
	//Validating phone number
	public void validatePhoneNumber(String phoneNumber) {
		
		this.phoneNumber = phoneNumber;
		Matcher nameMatch = GET_PATTERN_PHNO.matcher(this.phoneNumber);
		if(nameMatch.matches()) {
			System.out.println("Phone number : "+this.phoneNumber);
		} else {
			System.out.println("Invalid phone number");
		}
	}
	
	//Validating phone number
	public void validatePassword(String password) {
			
		this.password = password;
		Matcher nameMatch = GET_PATTERN_PWD.matcher(this.password);
		if(nameMatch.matches()) {
			System.out.println("Password : "+this.password);
		} else {
			System.out.println("Invalid password");
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		UserRegistration userObject = new UserRegistration();
		
		//Local variable
		String firstName;
		String lastName;
		String email;
		String phoneNumber;
		String password;
		
		//Taking user input
		System.out.println("Enter first name :");
		firstName = sc.next();
		System.out.println("Enter last name : ");
		lastName = sc.next();
		sc.nextLine();
		System.out.println("Enter email :");
		email = sc.nextLine();
		System.out.println("Enter phone number : ");
		phoneNumber = sc.nextLine();
		System.out.println("Enter password :");
		password = sc.nextLine();
		
		//Calling validation functions
		userObject.validateFirstName(firstName);
		userObject.validateLastName(lastName);
		userObject.validateEmail(email);
		userObject.validatePhoneNumber(phoneNumber);
		userObject.validatePassword(password);
	}
}
