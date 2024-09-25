package com.deloitte.Lab04.ex2.com.cg.eis.pl;

import java.util.Scanner;

import com.deloitte.Lab04.ex2.com.cg.eis.services.Service;

public class Input  {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        
        
        System.out.print("Enter Employee Name: ");
        String name = sc.next();
        
        System.out.print("Enter Employee Salary: ");
        double salary = sc.nextDouble();
        
        Service empService = new Service(id, name, salary);
        empService.calculateScheme();
        empService.displayDetails();
}
}
