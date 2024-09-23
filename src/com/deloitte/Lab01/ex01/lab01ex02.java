package com.deloitte.Lab01.ex01;

import java.util.Scanner;

public class lab01ex02 {
	public static void main(String[] args) {
		System.out.println("select the light");
		System.out.println("1-Red");
		System.out.println("2-yellow");
		System.out.println("3-green");
		
		Scanner sc =  new Scanner(System.in);
		int light = sc.nextInt();
		
		if (light == 1) {
			System.out.println("stop");
		}
		else if (light == 2) {
			System.out.println("wait");
			
		}
		
		else if (light == 3) {
			System.out.println("go");
		}
		else{
			System.out.println("invalid");
		}
	}

}
