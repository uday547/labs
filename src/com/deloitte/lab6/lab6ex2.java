package com.deloitte.lab6;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;


public class lab6ex2 {
	public static Map<Character, Integer> charcount(char[] arr) {
		HashMap<Character, Integer> charcountmap = new HashMap<>() ;
		
		for (char c : arr) {
			if (charcountmap.containsKey(c)) {
                charcountmap.put(c, charcountmap.get(c) + 1);
		}
			else {
				charcountmap.put(c,1);
				
			}
	}
		return charcountmap;

}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
        String input = sc.nextLine();
        
        char[] arr = input.toCharArray();
        Map<Character, Integer> result = charcount(arr);
        System.out.println("Character count: " + result);
        
	}
}

