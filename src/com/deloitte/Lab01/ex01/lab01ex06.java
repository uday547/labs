package com.deloitte.Lab01.ex01;

import java.util.Scanner;

public class lab01ex06 {
	public int calculatedifference(int n) {
		int sumofsquares =0;
		int sum = 0;
		
		for(int i =1;i<=n;i++) {
			sumofsquares +=i*i;
			sum +=i;
			
		}
		
		int squareofsum=sum*sum;
		return squareofsum-sumofsquares;
	}
	public static void main(String[] args) {
		lab01ex06 calculator = new lab01ex06();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of n");
		int n = sc.nextInt();
		int result = calculator.calculatedifference(n);
		System.out.println("The difference of the numbers" + result);
		
	}


}
