package com.deloitte.Lab01.ex01;

import java.util.Scanner;

public class lab01ex03 {
	public static int fibonaccirecursive(int n) {
		if(n<=2) {
			return 1;
		}
		else {
			return fibonaccirecursive(n-1)+fibonaccirecursive(n-2);
		}
	}

	 public static int fibonacciiterative(int n) {
		 if(n<=2) {
			 return 1;
		 }
		
		 int prev1 = 1;
		 int prev2= 1;
		 int current =0;
		 for (int i=3;i<=n;i++)
		 {
			 current = prev1+prev2;
			 prev1=prev2;
			 prev2=current;
		 }
		 return current;
	 }
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=sc.nextInt();
		
		int recursiveresult = fibonaccirecursive(n);
		int iterativeresult = fibonacciiterative(n);
		
		System.out.println("recursive resut" + recursiveresult);
		System.out.println("iterati veresult" + iterativeresult);
		
	}

}
