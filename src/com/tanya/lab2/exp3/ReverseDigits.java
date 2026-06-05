package com.tanya.lab2.exp3;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseDigits {
public static void main(String[] args) {
	System.out.println("Enter the numbers which should be greater then 1 digit: ");
	Scanner sc  = new Scanner(System.in);
	int[] arr = new int[5];
	for(int i = 0; i<arr.length; i++) {
		 arr[i] = sc.nextInt();
	}
	System.out.println(Arrays.toString(arr));
	getSorted(arr);
}
public static void getSorted(int[] arr) {

    for (int i = 0; i < arr.length; i++) {
        int num = arr[i];
        int reverse = 0;
           while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        arr[i] = reverse;
    }

    Arrays.sort(arr);

    System.out.println(Arrays.toString(arr));
}

}
