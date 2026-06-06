package com.tanya.lab3.ex6;

public class Solution {
	public static boolean isPositiveString(String str) {

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) >= str.charAt(i + 1)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPositiveString("ANT"));   // true
        System.out.println(isPositiveString("BOY"));   // true
        System.out.println(isPositiveString("APPLE")); // false
    }

}
