package com.deloitte.Lab9;

import java.util.Scanner;

public class lab9ex3 {
	public static boolean checkCredentials(String user, String pass) {
		 return authenticateUser(user, pass);
    }
	@FunctionalInterface
	interface Authenticator {
	    boolean authenticate(String username, String password);
	}
	
	public static boolean authenticateUser(String user, String pass) {
		Authenticator auth = (username, password) -> username.equals("admin") && password.equals("password123");
		 return auth.authenticate(user, pass);
	    }
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter username: ");
	        String username = scanner.nextLine();
	        
	        System.out.print("Enter password: ");
	        String password = scanner.nextLine();
	        boolean isAuthenticated = checkCredentials(username, password);
	        
	        if (isAuthenticated) {
	            System.out.println("Authentication successful!");
	        } else {
	            System.out.println("incorrect username or password.");
	        }
	}

}
