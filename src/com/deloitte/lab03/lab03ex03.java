package com.deloitte.lab03;

import java.util.Scanner;

public class lab03ex03 {
	public static String alterString(String input) {
		StringBuilder sb = new StringBuilder();
		 
		for( int i = 0; i<input.length();i++) {
			char ch = input.charAt(i);
			if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                if (ch == 'z') {
                	sb.append('a');
                }
                else  {
                	sb.append((char) (ch + 1));
                }
                }
                else {
                	sb.append(ch);
                }
		}
			
			return sb.toString();
			
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word:");
		String input = sc.nextLine();
		String output = alterString(input);
		System.out.println(output);
		
	}
		

}
