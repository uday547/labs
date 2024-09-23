package com.deloitte.lab02.ex01;

import java.util.Arrays;
import java.util.Scanner;

public class lab02ex03 {
public static int[] getSorted(int[] arr) { 
for (int i =0;i<arr.length/2;i++) {
	int temp = arr[i];
	arr[i] = arr[arr.length-1-i];
	arr[arr.length-1-i] =temp;
	
	
}
Arrays.sort(arr);
return arr;
}
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the number of elemnts:");
	int n = sc.nextInt();
	int[] arr = new int[n];
	System.out.println("enter the elements");
	for(int i = 0;i<n;i++) {
		arr[i]= sc.nextInt();
		
	
}
	System.out.println("reversed arry :");
	for(int i = arr.length - 1;i>0;i--) {
		System.out.println(arr[i]+ "");
	}
	System.out.println();

    int[] sortedArr = getSorted(arr);

    System.out.println("Sorted array with reversed elements:");
    for (int num : sortedArr) {
        System.out.print(num + " ");
    }

}
}







