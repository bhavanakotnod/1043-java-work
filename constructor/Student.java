package com.constructor;

import java.util.Scanner;

public class Student {
	int studentId;          // global variable
	String stu_name;
	String course;
	String year;
	double percentage;
	
	public Student(int studentId,String stu_name,String course,String year,double percentage ) {
		this.studentId = studentId;
		this.stu_name = stu_name;
		this.course = course;
		this.year = year;
		this.percentage = percentage;
		
		
	}
	public void m1() {
		System.out.println("Student detils......");
		
		System.out.println("Student id..."+ this.studentId);
		System.out.println("Student name "+ this.stu_name);
		System.out.println("Course "+ this.course);
		System.out.println("year of student "+this.year);
		System.out.println("percentage of student "+ this.percentage);
	}
	public void CalculateGrade() {
		int  passingMarks; 
		char grade; 
		passingMarks = 40; 
		 
		if (percentage >= passingMarks) { 
		if (percentage > 90) 
		grade = 'A'; 
		else if (percentage > 75) 
		grade = 'B'; 
		else if (percentage > 60) 
		grade = 'C'; 
		else 
		grade = 'D'; 
		System.out.println("You passed the exam and your grade is " + grade); 
		} 
		else { 
		grade = 'F'; 
		System.out.println("You failed and your grade is " + grade); 
		} 
	}
		
}
