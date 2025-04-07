package com.Scanner;
import java.util.Scanner;
public class Student { 
	public static void main(String[] args) {
	

	Scanner sc =new Scanner(System.in) ;
	System.out.println("Enter a name of the student");
	String name = sc.nextLine();
	System.out.println(name);
	
	System.out.println("Enter Student branch");
	String branch = sc.nextLine();
	System.out.println(branch);
	
	System.out.println("Enter a roll number");
	int rollno = sc.nextInt();
	System.out.println(rollno);
	
	System.out.println("Enter a percentage");
    double percentage = sc.nextDouble();
    System.out.println(percentage);
    
    Student_Details s = new Student_Details();
    s.student(percentage);
    System.out.println("----------------------------------------------");
    
	
	}
}
