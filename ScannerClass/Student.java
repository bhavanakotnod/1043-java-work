package ScannerClass;
import java.util.Scanner;
public class Student {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a student name");
		String name = sc.nextLine();
		
		System.out.println("Enter roll number");
		int rollno = sc.nextInt();
		System.out.println("Enter marks for three subject");
		System.out.println("math");
		int math = sc.nextInt();
		System.out.println("physic");
		int phy = sc.nextInt();
		System.out.println("bio");
		int bio = sc.nextInt();
		
		Student_Details s = new Student_Details();
		s.total(math, phy, bio);
		Student_Details s1 = new Student_Details();
		s1.grade(bio);
		
		
		
		
		
		
	}

}
