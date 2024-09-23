package com.deloitte.lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


public class lab6ex1 {
 public static List<Integer> getValues(HashMap<String, Integer>map){
	 List<Integer>valueList = new ArrayList<>(map.values());
	  Collections.sort(valueList);
	  return valueList;
 }
 
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	HashMap<String, Integer> map = new HashMap<>();
	System.out.println("Enter the number of entries:");
    int n = sc.nextInt();
    
    for (int i = 0; i<n; i++) {
    	System.out.println("enter name :");
    	 String name = sc.next();
    	 System.out.println("Enter value:");
         int value = sc.nextInt();
         map.put(name, value);
    }
    List<Integer> sortedValues = getValues(map);
    System.out.println("Value in sorted order" +sortedValues);
    
    }
    
}

