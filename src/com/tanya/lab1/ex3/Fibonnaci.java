package com.tanya.lab1.ex3;

import java.util.Scanner;

public class Fibonnaci {
	public static void main(String[] args) {
		System.out.println("Enter the value of n: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		series(n);

	}
   public static void series(int n) {
	   int a = 0 , b = 1;
	   if(n==0) {
		   System.out.println(0);
	   }
	   else if(n==1) {
		   System.out.println(1);
	   }
	   else {
		   System.out.print(a + " " + b);
        for(int i = 2; i<n; i++) {
        	int c = a + b;
        	System.out.print(" " + c + " ");
           a = b;
           b = c;
        }
	   }
   }
   
}
