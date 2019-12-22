package com.class12;

import java.util.Scanner;

public class PasswordUserName {

	public static void main(String[] args) {
		
		
		/*
		 * 
		 * Accept username, password and confirm password and check following requirements:
Username and Password cannot be  empty, if so→ message=“Username and Password cannot be empty”.
Password should be minimum 8 characters, if less → message=“Password is too short”.
Password cannot contain username if so, → message=“Password cannot contain username”.
Password should match confirmed password, if not  → message=“Passwords do not match”.
Only after all requirements met → message “Your username and password has been created”
		 */
		Scanner sc=new Scanner(System.in);
		while(true) {
			
		
		System.out.println("Create your username" );
		String userName=sc.next();
		System.out.println("Create your Password. Passwords must be min. 8 charecters contain.");
		String password=sc.next();
		
		if(userName.isEmpty() || password.isEmpty()) {
			System.out.println("Username or passwords can not be empty.Try again");
		}
		else if(password.length()<8) {
			System.out.println("Password is too short. Try again");
		}
		else if(password.contains(userName)) {
			System.out.println("Password cannot contain username. Try again");
		}
		else {
			while(true) {
			System.out.println("Please confirm your passwords");
			String password1=sc.next();
			if(!(password.equals(password1))) {
				System.out.println("Passwords do not match. Try again.");
			}
			else {
				System.out.println("Your username and password has been created.");
				break;
			}}
			break;
		}
		}
	}
}



