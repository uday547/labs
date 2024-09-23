package com.deloitte.lab03.ex03;

import java.util.Scanner;

public class lab03ex04 {
	public static String modifynumber(String input) {
        String s = "";
        for (int i = 0; i < input.length(); i++) {
            int no1;
            int no2;
            int diff = 0;
            
            if (i == input.length() - 1) {
                s += input.charAt(i); 
            } else {
            	 no1 = Character.getNumericValue(input.charAt(i));  
                 no2 = Character.getNumericValue(input.charAt(i + 1));
                 
                 diff = Math.abs(no1 - no2);
                 s += diff;
            }
        }

        System.out.println(s);
        return s;
    }

    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        modifynumber(input);
            }
}
