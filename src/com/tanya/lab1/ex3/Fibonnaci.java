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
	   int a = 0;
	   if(n==0) {
		   System.out.println(0);
	   }
	   else if(n==1) {
		   System.out.println(1);
	   }
	   else {
		    a = (n-1) + (n-2);
	   }
	  System.out.println(a);
   }
   
}
