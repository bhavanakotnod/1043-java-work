
package com.Encapsulation;

public class Student_details {
	public static void main(String[] args) {
		Student s = new Student();

		s.setrool_no(123);

		s.setStu_name("Bhavana");

		s.setbranch("CSE");

		s.setPercentage(89.70);

		System.out.println( "Roll no "+ (s.getroll_no()));
		System.out.println("Student name " +(s.getStu_name()));
		System.out.println("Branch " +(s.getbranch()));
		System.out.println("Percentage "+(s.getPercentage()));
		
		System.out.println("----------------------------");
		Student s1 = new Student();
		s1.setrool_no(123);
		s1.setStu_name("Shiva");
		s1.setbranch("EEE");
		s1.setPercentage(90.20);
		System.out.println("Roll no "+ (s1.getroll_no()));
		System.out.println("Name of the student "+ (s1.getbranch()));
		System.out.println("branch " + (s1.getbranch()));
		System.out.println("percentage "+(s1.getPercentage()));
		
	}

}
