package com.deloitte.Lab01.ex01;

import java.util.Scanner;

public class lab01ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number : ");
		int n = sc.nextInt();
		System.out.println("prime numbers upto "  +n);
	
	for (int i = 2; i<=n; i++) {
		int count = 0;
		for (int j = 1; j<=i; j++) {
			if(i%j==0) {
				count++;
			}
		}
		
		if (count == 2) {
			System.out.println(" " +i);
		
		}
			
		}
	}

}
