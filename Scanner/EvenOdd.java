package com.Scanner;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		System.out.println("Check " +a+" is even or odd");
		if (a % 2 == 0) {
			System.out.println("number is Even");
		} else {
			System.out.println("Number is odd");
		}

	}

}
