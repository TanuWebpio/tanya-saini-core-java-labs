package com.tanya.lab4.ex2;


public class Main {

    public static void main(String[] args) {

        Employee emp = new Employee();

        EmployeeService service = new EmployeeServiceImpl();

        service.getEmployeeDetails(emp);

        service.displayEmployee(emp);
    }
}
