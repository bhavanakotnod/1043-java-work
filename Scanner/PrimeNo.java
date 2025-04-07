package com.Scanner;
import java.util.Scanner;
public class PrimeNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  
		// Scanner class used for take the input from user
		System.out.println("Enter a number");
		//nextInt is the method of Scanner class
		int a = sc.nextInt();
		System.out.println("Check a "+a +" is Prime or not ");
		int temp = 0;
		//  check factor other than 1 and number itself
		for(int i =2;i<a;i++) {
			
		if(a%i==0) {
			temp = temp+1;
		}
		}
		if(temp>0 ) {
			System.out.println("number is not prime");
		}
		else {
			System.out.println("number is prime");
		}
		
	}

}
