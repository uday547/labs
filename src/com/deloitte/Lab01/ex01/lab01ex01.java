package com.deloitte.Lab01.ex01;

import java.util.Scanner;

public class lab01ex01 {
	public static int sumofcubes(int number)
	{
		int sum = 0;
		int temp = number;
		while(temp!=0) {
			int digit = temp % 10;
			sum += digit*digit*digit;
			temp = temp/10;
		}
		return sum;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the n digit number");
		int number = sc.nextInt();
		int sum = sumofcubes(number);
		System.out.println(" the sum of "  +number+ " digit number is :"  +sum);
		
	}

}
