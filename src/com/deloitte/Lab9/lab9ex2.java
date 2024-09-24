package com.deloitte.Lab9;

import java.util.Scanner;
import java.util.function.Function;

public class lab9ex2 {
	public static String formatString(String input) {
		Function<String, String> insertSpaces = str -> {
            StringBuilder formattedString = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                formattedString.append(str.charAt(i));
                if (i < str.length() - 1) {
                    formattedString.append(" ");
                }
            }
            return formattedString.toString();
		};
            return insertSpaces.apply(input);
	    }
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
		System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        String formattedString = formatString(inputString);
        System.out.println("Formatted String: " + formattedString);
        
	}
}

