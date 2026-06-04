package com.tanya.lab1.ex2;

import java.util.Scanner;

public class Lights {
	public static void main(String[] args) {
		System.out.println("Enter the light color...");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if(s.contains("red")) {
			System.out.println("stop");
		}
		else if(s.contains("yellow")) {
			System.out.println("ready");
		}
		else {
			System.out.println("go");
		}
	}
}
