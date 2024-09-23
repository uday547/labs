package com.deloitte.lab6;

import java.util.Scanner;

public class lab6ex5 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int len = sc.nextInt();
        int[] num = new int[len];
        for (int i = 0; i < len; i++) {
            System.out.println("Enter element " + (i + 1) + ": ");
            num[i] = sc.nextInt();
        }
        
            int secondSmall = getSecondSmallestelemnt(num, len);
            System.out.println("The second smallest element is: " + secondSmall);

        }
	

public static int getSecondSmallestelemnt(int[] num, int len) {
	        int temp;
	        for (int i = 0; i < len; i++) {
	            for (int j = i + 1; j < len; j++) {
	                if (num[i] > num[j]) {temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
	                	
	                	
	            }
	            }
	        return num[1];
	 }


}
