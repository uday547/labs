package com.deloitte.Lab01;

import java.util.Scanner;

public class lab01ex07 {
	public boolean checknum(int num) {
		
		if(num<10) {
			return false;
		}
			int previousdigit = num%10;
			num = num/10;
			while (num > 0) {
	            int currentDigit = num % 10;
	            if (currentDigit > previousdigit) {
	                return false;
	            }
	            previousdigit = currentDigit;
	            num = num / 10;
	        }

	        return true;
	    }
			

	public static void main(String[] args) {
		
		lab01ex07 check = new lab01ex07();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		
		boolean result = check.checknum(num);
		if(result) {
			System.out.println(num + "increasing number");
		}
		else
		{
			System.out.println(num + "not increasing number");
		}
	}

	
	

}
