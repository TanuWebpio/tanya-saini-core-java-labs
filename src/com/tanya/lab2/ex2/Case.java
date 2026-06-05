package com.tanya.lab2.ex2;

import java.util.Arrays;
import java.util.Scanner;


public class Case {
	public static void main(String[] args) {
		System.out.println("Enter the Fruits name: ");
		Scanner sc = new Scanner(System.in);
		String[] s = new String[5];
		for(int i = 0; i<s.length; i++) {
		   s[i] = sc.next();
		}
		System.out.println(Arrays.toString(s));
		Arrays.sort(s);
		System.out.println(Arrays.toString(s));
		int split;
		int n = s.length;
		if(n % 2 == 0) {
			split = n/2;
		}else {
			split = (n/2) +1;
		}
		for(int i = 0; i<s.length; i++) {
			if(i<split) {
				s[i] = s[i].toUpperCase();
			}else {
				s[i] = s[i].toLowerCase();
			}
		}
		System.out.println("Expected Array: " + Arrays.toString(s));
	}
}
