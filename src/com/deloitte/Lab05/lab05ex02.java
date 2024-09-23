package com.deloitte.Lab05;

import java.util.Scanner;

class InvalidNameException extends Exception{
	public InvalidNameException(String message) {
        super(message);
    }
}


public class lab05ex02 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the first name: ");
	        String firstName = sc.nextLine();
	        System.out.println("Enter the last name: ");
	        String lastName = sc.nextLine();
	        
	        try {
	        	if (firstName.isEmpty() || lastName.isEmpty()) {
	        		throw new InvalidNameException("first name or last name cant be blank");
	        		
	        	}
	        	System.out.println("employee name is valid:" +firstName +" " +lastName);
	        	
	        }
	        catch(InvalidNameException e) {
	        	System.out.println("InvalidNameException" +e.getMessage());
	        	
	        }
	        
	        	
	        }
	        
	
	

}
