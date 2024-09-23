package com.deloitte.lab6;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class lab6ex7 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        int[] sortedReversedArray = getSorted(numbers);
        System.out.println("Sorted and reversed array: " + Arrays.toString(sortedReversedArray));

}
	public static int[] getSorted(int[] arr) {
		String[] reversedStrings = new String[arr.length];
		for (int i = 0; i < arr.length; i++) {
            String reversed = new StringBuilder(String.valueOf(arr[i])).reverse().toString();
            reversedStrings[i] = reversed;
        }
		
		Arrays.sort(reversedStrings, Collections.reverseOrder());
		
		int[] sortedReversedArray = new int[reversedStrings.length];
        for (int i = 0; i < reversedStrings.length; i++) {
            sortedReversedArray[i] = Integer.parseInt(reversedStrings[i]);
        }
        return sortedReversedArray;
	}

	
	}
	
