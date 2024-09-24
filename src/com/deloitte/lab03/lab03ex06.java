package com.deloitte.lab03;

import java.util.Scanner;

public class lab03ex06 {
	public static boolean positiveString(String input) {
		if (input == null || input.isEmpty()) {
            return false;
	}
		
		for (int i = 0; i < input.length() - 1; i++) {
			char currentChar = input.charAt(i);
            char nextChar = input.charAt(i + 1);if (currentChar >= nextChar) {
                return false;
            
            
		}
		}
		return true;
    }
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Enter a string");
	 String Input = sc.nextLine();
	 
	 if(positiveString(Input)) {
		 System.out.println("The string '" + Input + "' is a positive string.");
     } else {
         System.out.println("The string '" + Input + "' is not a positive string.");
     }
	 }
}

		


