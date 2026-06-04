package com.tanya.lab1.ex2;

import java.util.Scanner;

public class Lights {
	public static void main(String[] args) {
		System.out.println("Enter the integer for light color...red = 1 , yellow = 2, green = 3");

		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		if(s == 1) {
			System.out.println("stop");
		}
		else if(s==2) {
			System.out.println("ready");
		}
		else {
			System.out.println("go");
		}
	}
}
