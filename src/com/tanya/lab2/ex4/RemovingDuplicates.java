package com.tanya.lab2.ex4;

import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class RemovingDuplicates {
	public static void main(String[] args) {
		System.out.println("Enter the elemnts of an array");
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i =0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		System.out.println(Arrays.toString(arr));
         int[] result = removeDuplicatesAndSortDesc(arr);
         for(int num : result) {
        	 System.out.print(num + " ");
         }
	}
	 public static int[] removeDuplicatesAndSortDesc(int[] arr) {
	        // Use Set to remove duplicates
	        Set<Integer> set = new HashSet<>();

	        for (int num : arr) {
	            set.add(num);
	        }

	        // Convert Set to List
	        List<Integer> list = new ArrayList<>(set);

	        // Sort in descending order
	        Collections.sort(list, Collections.reverseOrder());

	        // Convert List to int[]
	        int[] result = new int[list.size()];
	        for (int i = 0; i < list.size(); i++) {
	            result[i] = list.get(i);
	        }

	        return result;
	    }
}
