package com.capgemini.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	
	//Class variable
	private static final String PATTERN_FOR_NAME = "^[A-Z]{1}[a-z]{2,}$";
	private static final String PATTERN_FOR_EMAIL = "^[abc]{3}[.+-_]{0,1}[a-z0-9]*@[a-z0-9]+.[a-z.]*[a-z]{2,}";
	private static final String PATTERN_FOR_PHNO = "^[0-9]{1,3}\s{1}[0-9]*{10}";
	private static final String PATTERN_FOR_PASSWORD = "[[A-Z]+?[0-9]+?[a-z]*?[@#-_%.]{1}?]{8,}";
	
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
	public boolean validateFirstName(String name) throws InvalidUserDetailsException{
		
		this.firstName = name;
		Matcher firstNameMatch = GET_PATTERN_NAME.matcher(this.firstName);
		
		if (!(firstNameMatch.matches()))
			throw new InvalidUserDetailsException("Invalid First Name");
		else
			return firstNameMatch.matches();
			
	}
	
	//Validating last name
	public boolean validateLastName(String name) throws InvalidUserDetailsException {
		
		this.lastName = name;
		Matcher lastNameMatch = GET_PATTERN_NAME.matcher(this.lastName);
		
		if (!(lastNameMatch.matches()))
			throw new InvalidUserDetailsException("Invalid Last Name");
		else
			return lastNameMatch.matches();
	}
	
	//Validating email
	public boolean validateEmail(String email) throws InvalidUserDetailsException {
		
		this.email = email;
		Matcher emailMatch = GET_PATTERN_EMAIL.matcher(this.email);
		
		if (!(emailMatch.matches()))
			throw new InvalidUserDetailsException("Invalid email");
		else
			return emailMatch.matches();
	}
	
	//Validating phone number
	public boolean validatePhoneNumber(String phoneNumber) throws InvalidUserDetailsException {
		
		this.phoneNumber = phoneNumber;
		Matcher phoneNumberMatch = GET_PATTERN_PHNO.matcher(this.phoneNumber);
		if (!(phoneNumberMatch.matches()))
			throw new InvalidUserDetailsException("Invalid phone number");
		else
			return phoneNumberMatch.matches();
	}
	
	//Validating password
	public boolean validatePassword(String password) throws InvalidUserDetailsException {
			
		this.password = password;
		Matcher passwordMatch = GET_PATTERN_PWD.matcher(this.password);
		
		if (!(passwordMatch.matches()))
			throw new InvalidUserDetailsException("Invalid First Name");
		else
			return passwordMatch.matches();
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
		try {
			userObject.validateFirstName(firstName);
			
		} catch (InvalidUserDetailsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			userObject.validateLastName(lastName);
		} catch (InvalidUserDetailsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			userObject.validateEmail(email);
		} catch (InvalidUserDetailsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			userObject.validatePhoneNumber(phoneNumber);
		} catch (InvalidUserDetailsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			userObject.validatePassword(password);
		} catch (InvalidUserDetailsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
