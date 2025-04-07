package com.Scanner;

public class Student_Details {
	public void student(double percentage) {
		char grade = 0 ;
		int passing_marks = 40;
		if(percentage >= passing_marks) {
		if(percentage > 90) 
			grade = 'A';
		
		else if(percentage > 80) 
			grade = 'B';
		else if(percentage > 70)
			grade = 'C';
		else if(percentage > 60)
			grade = 'D';
		System.out.println("you passed the exam and your grade is "+ grade);
		}
	     else {
		grade = 'F';
		System.out.println("you failed the exam and your grade is "+ grade);
	
	}
	}
}
