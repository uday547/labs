package com.deloitte.Lab04.ex2.com.cg.eis.services;

import com.deloitte.Lab04.ex2.com.cg.eis.bean.Employee;

public class Service extends Employee{

	 public Service(int id, String name, double salary) {
	        super(id, name, salary);
	    }
	 public void calculateScheme() {
	        String scheme;
	        String role;

	        if (getSalary() < 5000) {
	            scheme = "No Scheme";
	            role = "Clerk";
	        } else if (getSalary() <= 20000) {
	            scheme = "Scheme C";
	            role = "Associate";
	        } else if (getSalary() <= 40000) {
	            scheme = "Scheme B";
	            role = "Programmer";
	        } else {
	            scheme = "Scheme A";
	            role = "Manager";
	        }

	        setDesignation(role);
	        setInsuranceScheme(scheme);
	 }
	        public void displayDetails() {
	            System.out.println("Employee ID: " + getId());
	            System.out.println("Employee Name: " + getName());
	            System.out.println("Designation: " + getDesignation());
	            System.out.println("Salary: " + getSalary());
	            System.out.println("Insurance Scheme: " + getInsuranceScheme());
	        
	    }
	 
}