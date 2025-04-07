package com.Scanner;

import java.util.Scanner;

/*A palindrome is a word, phrase, number, or other sequence 
 * of characters that reads the same backward as forward
 */
public class Palindrome {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// number is entered by user
		System.out.println("Enter a number");
		int num = sc.nextInt();

		// method calling
		Palindrome p = new Palindrome();
		p.m1(num);

	}

	public void m1(int num) {
		int original = 0; // local variable
		int rev = 0;
		int rem;
		for (; num != 0;) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;

		}
		
		// check the number is palindrome or not
		if (rev == original) {
			System.out.println("number is palindrom");

		} else {
			System.out.println(rev+"  Number is not palindrome");

		}

	}
}
