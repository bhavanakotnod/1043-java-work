package com.Encapsulation;

public class Employee_Details {
	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.setEmp_name("Bhavana");
		e.setemp_id(123);
		e.setDesignation("manager");
		
		System.out.println("employee id "+(e.getemp_id()));
		System.out.println("employee name "+ (e.getEmp_name()));
		System.out.println("employee designation "+ (e.getDesignation()));
	} 
	

}
