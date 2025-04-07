package com.constructor;

public class Student_Details {
	public static void main(String[] args) {
		Student s = new Student(123,"Bhavana","Computer Engg","final yr",91.20);
		s.m1();
		s.CalculateGrade();
		
		System.out.println("-----------------------------------------------");
		Student s1 = new Student(124,"Shruti","Electric Engg","3rd yr",40);
		s1.m1();
		s1.CalculateGrade();
		
	}
	

}
