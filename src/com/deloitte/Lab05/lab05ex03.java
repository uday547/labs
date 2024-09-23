package com.deloitte.Lab05;

import java.util.Scanner;

class EmployeeException extends Exception {
	public EmployeeException(String message) {
		super(message);
	}
}

class Employee{
	private String name;
	private double salary;
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public void checksalary() throws EmployeeException{
		if (salary<300) {
			throw new EmployeeException("salary is below 300 for: " +name);
		}
		else {
			System.out.println("salary is valid for :" +name);
		}
	}
}

public class lab05ex03 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the employee name :");
		String name = sc.nextLine();
		System.out.println("enter the employee salary :");
		double salary = sc.nextDouble();
		
		Employee  employee = new Employee(name,salary);
		try {
			employee.checksalary();
		} catch(EmployeeException e) {
			System.out.println("exception" +e.getMessage());
		}
		
		
	}

	
}
