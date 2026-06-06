package com.tanya.lab5.ex3;

import java.util.Scanner;


public class EmployeeSalaryValidation {

    public static void validateSalary(double salary)
            throws EmployeeException {

        if (salary < 3000) {
            throw new EmployeeException("Salary must be at least 3000.");
        } else {
            System.out.println("Valid Salary.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        Employee emp = new Employee(id, name, salary);

        try {
            validateSalary(emp.getSalary());
            System.out.println("Employee accepted: " + emp.getName());
        } catch (EmployeeException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}