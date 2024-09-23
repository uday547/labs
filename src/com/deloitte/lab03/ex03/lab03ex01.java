package com.deloitte.lab03.ex03;

import java.util.Scanner;

public class lab03ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a line of integers");
		
		String input = sc.nextLine();
		String[] number = input.split(" ");
		int sum = 0;
		
		for (String numStr : number) {
			int n = Integer.parseInt(numStr);
			System.out.println("number" +n);
			sum+=n;
			
		}
		
		System.out.println("sum of the numbers is :" +sum);
		
	}

}
