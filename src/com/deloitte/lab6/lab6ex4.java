package com.deloitte.lab6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class lab6ex4 {
	
	public static void main(String[] args) {
		 Map<Integer, Integer> student = new HashMap<>();
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the number of students: ");
	        int numStudents = sc.nextInt();
	        
	        for (int i = 0; i < numStudents; i++) {
	            System.out.println("Enter registration number for student " + (i + 1) + ": ");
	            int regNum = sc.nextInt();
	            System.out.println("Enter marks for student " + (i + 1) + ": ");
	            int marks = sc.nextInt();
	            student.put(regNum, marks);
	        }
	        
	        Map<Integer, String> getStudentMap = getStudents(student);
	        for (Map.Entry<Integer, String> entry : getStudentMap.entrySet()) {
	            System.out.println("Student REGESTRAION NUMBER: " + entry.getKey() + "  Medal Type: " + entry.getValue());
	            }
	        }
	        public static Map<Integer, String> getStudents(Map<Integer, Integer> student) {
	        	 Map<Integer, String> eligableforScholarship = new HashMap<>();
	        	 
	        	 for (Map.Entry<Integer, Integer> entry : student.entrySet()) {
	                 int marks = entry.getValue();
	                 if(marks>=90) {
	                	 eligableforScholarship.put(entry.getKey(), "gold");
	                	 
	                 }
	                 else if(marks>=80) {
	                	 eligableforScholarship.put(entry.getKey(), "silver");
	                 
	                 }
	                 else if(marks>=70) {
	                	 eligableforScholarship.put(entry.getKey(), "bronze");
	                	 
	                 }else {
	                	 eligableforScholarship.put(entry.getKey(),"not eligible FOR SCHOLARSHIP");
	                 }
	                	 
	                 }
	        	 
	        	 return eligableforScholarship;
	        }
	}


