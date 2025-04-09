package com.Encapsulation;

public class Employee {
	private int emp_id;
	private String emp_name;
	private String designation;
	
	public int getemp_id() {
		return emp_id;
		
	}
	public void setemp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	

}
