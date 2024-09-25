package com.deloitte.Lab9;

import java.util.Scanner;
import java.util.function.BiFunction;

public class lab9ex1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the number(x):");
	double x = sc.nextInt();
	
	System.out.println("enter the number (y):");
	double y = sc.nextInt();
	
	BiFunction<Double, Double, Double> power = (base, exponent) -> Math.pow(base, exponent);
	double result = power. apply(x,y);
	System.out.println("result:" +result);
}
}
