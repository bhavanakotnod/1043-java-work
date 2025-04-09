package com.Encapsulation;

public class Student {
	private int roll_no;
	private String stu_name;
	private String branch;
	private double percentage;
	
	public int  getroll_no() {
		return roll_no;
	}
	public int  setrool_no(int roll_no) {
		this.roll_no = roll_no;
		return roll_no;
	}
	public String getStu_name() {
		return stu_name;
	}
	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	
	public String getbranch() {
		return branch;
		
	}
	public void setbranch(String branch) {
		this.branch = branch;
	}

}
