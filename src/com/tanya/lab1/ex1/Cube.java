package com.tanya.lab1.ex1;

import java.util.Scanner;

public class Cube {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		int a = 0;
	    while(n>0) {
	       int r = n % 10;
	       a += r*r*r;
	        n = n/10;	   
	    }
	    System.out.println("Sum of the digits is: " + a);
	}
	
}
