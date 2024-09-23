package com.deloitte.Lab01.ex01;

import java.util.Scanner;

public class lab01ex05 {
	public int calculateSum(int n) {
		int sum=0;
		
		for(int i=1;i<=n;i++) {
			if(i%3==0||i%5==0) {
				sum+=i;
			}
		}
		return sum;
	}
public static void main(String[] args) {
	lab01ex05 calculator = new lab01ex05();
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the value of n");
	int n = sc.nextInt();
	
	int result =calculator.calculateSum(n);
	System.out.println("the sum of first  " + n + " natural numbers which are dividible by 3 and 5 : " + result);

}
}
