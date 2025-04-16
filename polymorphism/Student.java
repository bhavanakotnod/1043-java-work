package com.polymorphism;

// constructor chaining

public class Student {
	public Student()    // Constructor name is same as class name
	{
		System.out.println("no argument constructor.....");
	}
	public Student(int roll_no)   // COnstructor with parameter
	{
		System.out.println("Student roll number  "+ roll_no);
	}
	public Student(int roll_no,String name)     
	{
		System.out.println("Student rollno and name  "+ roll_no +" "+name);
	}
	public static void main(String[] args) {
		Student s = new Student();
		Student s1 = new Student(23);
		Student s2 = new Student(23, "Bhavana");
	}

}
