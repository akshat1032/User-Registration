package com.capgemini.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FunctionalInterface
interface ValidateUserDetails{
	public boolean validateDetails(String userInformation);
	static void printResult(String userInfo, String functionName, ValidateUserDetails validateDetail) {
		System.out.println(functionName + " is valid : "+validateDetail.validateDetails(userInfo));
	}
}

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
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
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
		
		ValidateUserDetails nameIsValid = (String userInformation) ->{
			Matcher nameMatch = GET_PATTERN_NAME.matcher(userInformation);
			if (nameMatch.matches())
				return true;
			return false;
		};
		
		ValidateUserDetails emailIsValid = (String userInformation) ->{
			Matcher emailMatch = GET_PATTERN_EMAIL.matcher(userInformation);
			if (emailMatch.matches())
				return true;
			return false;
		};
		
		ValidateUserDetails phoneNumberIsValid = (String userInformation) ->{
			Matcher phoneNumberMatch = GET_PATTERN_PHNO.matcher(userInformation);
			if (phoneNumberMatch.matches())
				return true;
			return false;
		};
		
		ValidateUserDetails passwordIsValid = (String userInformation) ->{
			Matcher passwordMatch = GET_PATTERN_PWD.matcher(userInformation);
			if (passwordMatch.matches())
				return true;
			return false;
		};
	
		ValidateUserDetails.printResult(firstName, "First Name", nameIsValid);
		ValidateUserDetails.printResult(lastName, "Last Name", nameIsValid);
		ValidateUserDetails.printResult(email, "Email ", emailIsValid);
		ValidateUserDetails.printResult(phoneNumber, "Phone Number", phoneNumberIsValid);
		ValidateUserDetails.printResult(password, "Password", passwordIsValid);
		
	}
}
