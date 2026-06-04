package com.tanya.lab1.ex6;

import java.util.Scanner;

public class Difference {
 public static void main(String[] args) {
	 System.out.println("Enter the value of n: ");
	 Scanner sc = new Scanner(System.in);
	 int n = sc.nextInt();
	 int diff = sumOfSquares(n) - squaresOfSum(n);
	 System.out.println(diff);
	
}
 public static int sumOfSquares(int n) {
	 int sum = 0;
	 for(int i = 1; i<=n; i++) {
		 sum += i*i;
	 }
	 return sum;
 }
 public static int squaresOfSum(int n) {
	 int sum = 0;
	 for(int i = 0; i<n; i++) {
		 sum += i;
	 }
	 return sum * sum;
 }
}
