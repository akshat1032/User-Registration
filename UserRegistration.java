package com.capgemini.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	
	//Class variable
	private static final String PATTERN_FOR_NAME = "[A-Z]{1}[a-z]{2,}$";
	private static final Pattern GET_PATTERN = Pattern.compile(PATTERN_FOR_NAME);
	
	//Instance variables
	private String firstName;
	
	//Validating firstName;
	public void validateFirstName(String name) {
		
		this.firstName = name;
		Matcher nameMatch = GET_PATTERN.matcher(this.firstName);
		if(nameMatch.matches()) {
			System.out.println("Welcome, "+this.firstName);
		} else {
			System.out.println("First name must start with cap and should contain at least 3 characters");
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		UserRegistration userObject = new UserRegistration();
		
		//Variable
		String firstName;
		
		System.out.println("Enter the first name :");
		firstName = sc.next();
		userObject.validateFirstName(firstName);
	}
}
