package com.tanya.lab1.ex5;

import java.util.Scanner;

public class Natural {
	public static void main(String[] args) {
		System.out.print("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(naturalNumbers(n));
	}
	
	public static int naturalNumbers(int n){
		int sum = 0;
		for(int i = 1; i<=n; i++){
			if(i % 3 == 0 || i % 5 == 0) {
				sum+= i;
			}
		}
		return sum;
	}
	
}
