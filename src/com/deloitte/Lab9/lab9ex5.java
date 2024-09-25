package com.deloitte.Lab9;


import java.util.Scanner;

public class lab9ex5 {
	
	static int factorial(int num) {
		int fact =1;
		for (int i=2; i<=num;i++) {
			fact=fact*i;
		}
		return fact;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number");
		
		int num = sc.nextInt();
		
		int result = factorial(num);
		System.out.println("factorial of the number is" +result);
	}

}
