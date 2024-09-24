package com.deloitte.lab03;

import java.util.Scanner;

public class lab03ex05 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int characterCount = 0, wordCount = 0, lineCount = 0;
        boolean Word = false;
        System.out.println("Enter text :");
        while (true) {
            String line = sc.nextLine();
            if (line.equals("")) {
                break;
            }
            lineCount++;
            for (int i = 0; i < line.length(); i++) {
                char ch = line.charAt(i);
                
                if (ch != ' ') {
                    characterCount++;
                }
                if (ch == ' ' || ch == '\n' || i == line.length() - 1) {
                    if (Word) {
                        wordCount++;
                        Word = false;
                    }
                } else {
                    Word = true; 
                }
            }
        }
        System.out.println("Number of lines: " + lineCount);
        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of characters: " + characterCount);
	}

}
        
