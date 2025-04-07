package com.Scanner;
import java.util.Scanner;
public class WeekDay {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your choice");
		int num = sc.nextInt();
		System.out.println("Entered day number is "+ num);
		
		WeeklyDay w = new WeeklyDay() ;
		w.week(num);
	
	}
}
