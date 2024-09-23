package com.deloitte.lab02.ex01;

import java.util.Scanner;

public class lab02ex01 {
	public static int getsecondsmallest(int[] arr) {
		int smallest = Integer.MAX_VALUE;
		int secondsmallest = Integer.MAX_VALUE;
		
		for (int i=0;i<arr.length;i++) {
			if (arr[i]<smallest) {
				secondsmallest = smallest;
				smallest = arr[i];
			}
			
			else if (arr[i]<secondsmallest && arr[i] != smallest)
			{
				secondsmallest = arr[i];
			}
			
		}
		
		return secondsmallest;
			
		}
		
	
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of elements in array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("enter the elements of the array");
		for(int i=0; i<size; i++) {
			arr[i]=sc.nextInt();
		}
		
		
		int secondsmallest = getsecondsmallest(arr);
		if (secondsmallest !=0) {
			System.out.println("second smallest elemnt in the array" + secondsmallest);
		}
		
	}


}
