package com.tanya.lab1.ex4;

import java.util.Scanner;

public class PrimeNumber {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);

     System.out.print("Enter an integer: ");
     int n = sc.nextInt();

     System.out.println("Prime numbers up to " + n + ":");

     for (int num = 2; num <= n; num++) {
         boolean isPrime = true;

         for (int i = 2; i <= Math.sqrt(num); i++) {
             if (num % i == 0) {
                 isPrime = false;
                 break;
             }
         }

         if (isPrime) {
             System.out.print(num + " ");
         }
     }

     sc.close();
 }
}

