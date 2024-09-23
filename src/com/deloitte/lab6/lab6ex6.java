package com.deloitte.lab6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class lab6ex6 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> people = new HashMap<>();
        System.out.println("Enter the number of people: ");
        int numberOfPeople = sc.nextInt();
        
        for (int i = 0; i < numberOfPeople; i++) {
            System.out.println("Enter ID for person " + (i + 1) + ": ");
            int id = sc.nextInt();
            System.out.println("Enter age for person " + (i + 1) + ": ");
            int age = sc.nextInt();
            people.put(id, age);
        }
        
        List<Integer> eligibleVoters = votersList(people);
        System.out.println("Eligible Voter IDs: " + eligibleVoters);
	}
        public static List<Integer> votersList(Map<Integer, Integer> people) {
            List<Integer> eligibleVoterIDs = new ArrayList<>();
            for (Map.Entry<Integer, Integer> entry : people.entrySet()) {
                int id = entry.getKey();
                int age = entry.getValue();
                if (age > 18) {
                    eligibleVoterIDs.add(id);
                }
            }

            return eligibleVoterIDs;
      }
	
}


