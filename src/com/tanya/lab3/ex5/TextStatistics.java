package com.tanya.lab3.ex5;

import java.util.Scanner;

public class TextStatistics {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter the text:");
	        String text = "";

	        // Read multiple lines until an empty line is entered
	        while (true) {
	            String line = sc.nextLine();
	            if (line.isEmpty()) {
	                break;
	            }
	            text += line + "\n";
	        }

	        // Count characters
	        int characters = text.length();

	        // Count lines
	        int lines = text.isEmpty() ? 0 : text.split("\n").length;

	        // Count words
	        String trimmedText = text.trim();
	        int words = trimmedText.isEmpty() ? 0 : trimmedText.split("\\s+").length;

	        System.out.println("Number of Characters: " + characters);
	        System.out.println("Number of Words: " + words);
	        System.out.println("Number of Lines: " + lines);

	        sc.close();
	    }
}
