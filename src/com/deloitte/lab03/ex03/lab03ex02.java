package com.deloitte.lab03.ex03;

import java.util.Scanner;

public class lab03ex02 {
	public static String getimage(String args) {
		StringBuffer sb = new StringBuffer(args);
		sb=sb.reverse();
		
		return sb.toString();
	}

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a word");
	String input=sc.nextLine();
	String reverse=getimage(input);
	
	String output=input+"|"+reverse;
	System.out.println(output);
	
}

}

