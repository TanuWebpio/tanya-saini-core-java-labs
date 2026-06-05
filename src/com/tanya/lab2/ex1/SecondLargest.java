package com.tanya.lab2.ex1;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {
	public static void main(String[] args) {
		System.out.println("Enter the value of any array: ");
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		//Basic logic...
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("Second Largest element: " + arr[arr.length - 2]);
		System.out.println("Second largest element for duplicates digits in an array: " + secondLargestElement(arr));

	}
	//work for edge cases also ...
	public static int secondLargestElement(int[] arr) {
		int largest = arr[0];
		int slargest = -1;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]>largest) {
				slargest = largest;
				largest = arr[i];
			}
			else if(arr[i]<largest && arr[i]>slargest) {
				slargest = arr[i];
			}
		}
		return slargest;
	}

}
