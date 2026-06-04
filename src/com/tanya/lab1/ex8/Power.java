package com.tanya.lab1.ex8;

import java.util.Scanner;

public class Power {
	    public static boolean isPowerOfTwo(int num) {
	        if (num <= 0) {
	            return false;
	        }

	        while (num > 1) {
	            if (num % 2 != 0) {
	                return false;
	            }
	            num /= 2;
	        }

	        return true;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        if (isPowerOfTwo(num)) {
	            System.out.println(num + " is a power of 2");
	        } else {
	            System.out.println(num + " is not a power of 2");
	        }

	        sc.close();
	    }
	}


