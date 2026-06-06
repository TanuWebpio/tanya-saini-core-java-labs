package com.tanya.lab3.ex4;

public class Solution {
	public static int modifyNumber(int number1) {
        String str = String.valueOf(number1);
        StringBuffer result = new StringBuffer();

        // Find absolute difference between consecutive digits
        for (int i = 0; i < str.length() - 1; i++) {
            int digit1 = str.charAt(i) - '0';
            int digit2 = str.charAt(i + 1) - '0';

            result.append(Math.abs(digit1 - digit2));
        }

        // Append the last digit unchanged
        result.append(str.charAt(str.length() - 1));

        return Integer.parseInt(result.toString());
    }

    public static void main(String[] args) {
        int number = 45862;
        System.out.println(modifyNumber(number)); // Output: 13242
    }

}
