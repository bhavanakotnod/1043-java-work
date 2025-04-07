package com.constructor;

public class Employee_Details {
	
	    public static void main(String[] args) {
	        // Creating employee objects
	        Employee emp1 = new Employee(101, "Alice Johnson", "Software Developer", 45000);
	        Employee emp2 = new Employee(102, "Bob Smith", "Project Manager", 65000);

	        // Display employee details and calculate bonus
	        emp1.displayEmployeeDetails();
	        System.out.println("Bonus: $" + emp1.calculateBonus());

	        emp2.displayEmployeeDetails();
	        System.out.println("Bonus: $" + emp2.calculateBonus());
	    }
	}



