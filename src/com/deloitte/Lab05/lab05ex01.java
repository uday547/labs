package com.deloitte.Lab05;

import java.util.Scanner;

class validateTheageException extends Exception {
    public  validateTheageException(String message) {
        super(message);
    }
}

public class lab05ex01 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        
        try {
            if (age <= 15) {
                throw new validateTheageException("Age must be above 15.");
            }
            System.out.println("Age is valid.");
        } catch (validateTheageException e) {
            System.out.println("AgeValidationException: " + e.getMessage());
        }
	}
}

        
            

