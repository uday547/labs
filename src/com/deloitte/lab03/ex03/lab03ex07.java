package com.deloitte.lab03.ex03;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class lab03ex07 {
	static void calculateDifference(LocalDate firstDate) {
		LocalDate currentDate = LocalDate.now();
		
		int years = currentDate.getYear() - firstDate.getYear();
        int months = currentDate.getMonthValue() - firstDate.getMonthValue();
        int days = currentDate.getDayOfMonth() - firstDate.getDayOfMonth();
	
	if (days < 0) {
        months--;
        days += firstDate.lengthOfMonth();
	}
	
	 if (months < 0) {
		 years--;
		 months += 12;
	 }
	 System.out.println("Duration from the given date to today is:");
     System.out.println(years + " years, " + months + " months, and " + days + " days");
	}
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		 System.out.println("Enter a date (dd/MM/yyyy): ");
	        String input = sc.nextLine();
	        LocalDate inputDate = LocalDate.parse(input, formatter);
	        calculateDifference(inputDate);

	        
	 }
}
