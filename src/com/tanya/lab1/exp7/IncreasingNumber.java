package com.tanya.lab1.exp7;

public class IncreasingNumber {
 public static void main(String[] args) {
	 int num = 1234;

	 if (isIncreasing(num)) {
	     System.out.println("Increasing Number");
	 } else {
	     System.out.println("Not an Increasing Number");
	 }
}
 public static boolean isIncreasing(int num) {
	    String str = String.valueOf(num);

	    for (int i = 0; i < str.length() - 1; i++) {
	        if (str.charAt(i) >= str.charAt(i + 1)) {
	            return false;
	        }
	    }

	    return true;
	}
}
