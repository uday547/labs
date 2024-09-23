package com.deloitte.lab02.ex01;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class lab02ex04 {
	public static int[] modifyArray(int[] arr) {
		HashSet<Integer> uniqueElements = new HashSet<>();
        for (int num : arr) {
            uniqueElements.add(num);
        }
        int[] resultArray = new int[uniqueElements.size()];
        int index = 0;
        for (int num : uniqueElements) {
            resultArray[index++] = num;
        }
        Arrays.sort(resultArray);
        reverseArray(resultArray);

        return resultArray;
    }
	 public static void reverseArray(int[] arr) {
	        int start = 0;
	        int end = arr.length - 1;
	        while (start < end) {
	            int temp = arr[start];
	            arr[start] = arr[end];
	            arr[end] = temp;
	            start++;
	            end--;
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of elements in the array: ");
	        int numElements = scanner.nextInt();

	        int[] arr = new int[numElements];
	        System.out.println("Enter the elements of the array:");

	        for (int i = 0; i < numElements; i++) {
	            System.out.print("Element " + (i + 1) + ": ");
	            arr[i] = scanner.nextInt();
	        }

	        int[] modifiedArr = modifyArray(arr);
	        System.out.println("Modified Array (without duplicates, in descending order):");
	        for (int num : modifiedArr) {
	            System.out.print(num + " ");
	        }
}
	  
}
