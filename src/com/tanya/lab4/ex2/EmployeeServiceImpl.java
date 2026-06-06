package com.tanya.lab4.ex2;

import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {

    Scanner sc = new Scanner(System.in);

    @Override
    public void getEmployeeDetails(Employee emp) {

        System.out.print("Enter Employee ID: ");
        emp.setId(sc.nextInt());

        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        emp.setName(sc.nextLine());

        System.out.print("Enter Salary: ");
        emp.setSalary(sc.nextDouble());

        sc.nextLine();

        System.out.print("Enter Designation: ");
        emp.setDesignation(sc.nextLine());

        emp.setInsuranceScheme(findInsuranceScheme(emp));
    }

    @Override
    public String findInsuranceScheme(Employee emp) {

        double salary = emp.getSalary();
        String designation = emp.getDesignation();

        if (salary > 50000 && designation.equalsIgnoreCase("Manager")) {
            return "Scheme A";
        }
        else if (salary > 20000 && salary <= 50000
                && designation.equalsIgnoreCase("Programmer")) {
            return "Scheme B";
        }
        else if (salary >= 5000 && salary <= 20000
                && designation.equalsIgnoreCase("System Associate")) {
            return "Scheme C";
        }
        else {
            return "No Scheme";
        }
    }

    @Override
    public void displayEmployee(Employee emp) {

        System.out.println("\nEmployee Details");
        System.out.println("----------------");
        System.out.println("ID                : " + emp.getId());
        System.out.println("Name              : " + emp.getName());
        System.out.println("Salary            : " + emp.getSalary());
        System.out.println("Designation       : " + emp.getDesignation());
        System.out.println("Insurance Scheme  : " + emp.getInsuranceScheme());
    }
}
