package com.constructor;

public class Employee {
    private int empId;
    private String empName;
    private String designation;
    private double salary;

    // Constructor
    public Employee(int empId, String empName, String designation, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.designation = designation;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("\nEmployee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: $" + salary);
    }

    // Method to calculate bonus
    public double calculateBonus() {
        if (salary < 50000) {
            return salary * 0.10; // 10% bonus
        } else {
            return salary * 0.05; // 5% bonus
        }
    }
}
