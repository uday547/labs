package com.deloitte.Lab01.ex01;

import java.util.Scanner;

public class lab01ex08 {
	public boolean checknum(int num) {
		if(num<=0)
		{
			return false;
		}
		
		while (num % 2 == 0) {
			num = num/2;
		}
			return num == 1;
		
	}
		public static void main(String[] args) {
			lab01ex08 check = new lab01ex08();
			
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the num");
			int n = sc.nextInt();
			
			boolean result = check.checknum(n);
	        if (result) {
	            System.out.println(n + " is a power of two.");
	        } else {
	            System.out.println(n + " is not a power of two.");
	        }
		
			
		}

}
