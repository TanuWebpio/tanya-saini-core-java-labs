package com.tanya.lab5.ex1;

import java.util.Scanner;

public class AgeValidation {

    public static void validateAge(int age) throws AgeNotValidException {
        if (age <= 15) {
            throw new AgeNotValidException("Age must be greater than 15.");
        } else {
            System.out.println("Valid age. Access granted.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        try {
            validateAge(age);
        } catch (AgeNotValidException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}
