package com.deloitte.lab02.ex01;

import java.util.Scanner;

public class lab02ex02 {
	public static String[] sortStrings(String[] arr) {
	
	int n = arr.length;
	for(int i=0; i<arr.length;i++) {
		for (int j=i+1;j<arr.length;j++) {
			if(arr[i].compareTo(arr[j])>0) {
				String temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}
	
	int mid = n / 2;
	
	for (int i = 0; i < mid; i++) {
        arr[i] = arr[i].toUpperCase();
    }
	for (int i = mid; i < n; i++) {
        arr[i] = arr[i].toLowerCase();
    }
	
	return arr;
}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

   
    System.out.println("Enter the number of strings:");
    int size = sc.nextInt();

    String[] strings = new String[size];
    
    System.out.println("Enter the strings:");
    for (int i = 0; i < size; i++) {
        strings[i] = sc.next();
    }
    String[] sortedStrings = sortStrings(strings);
    
    System.out.println("sorted array:");
    for (String str : sortedStrings) {
        System.out.println(str);
    }
}



}
