package com.deloitte.lab6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class lab6ex3 {
	public static Map<Integer, Integer> getSquares(int[] num){
		Map<Integer, Integer> squaresMap = new HashMap<>();
		for (int i: num) {
			int n = i*i;
			squaresMap.put(i,n);
		}
		return squaresMap;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
        int size = sc.nextInt();
        int[] num = new int[size];
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }
        Map<Integer, Integer> result = getSquares(num);
        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
            System.out.println("Number: " + entry.getKey() + " - Square: " + entry.getValue());
        }
	}

}
