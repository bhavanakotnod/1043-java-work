package com.Scanner;
import java.util.Scanner;

public class CheckVowel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//taking input from user
		System.out.println("Enter a Character");
		char ch = sc.next().charAt(0);
		//object creation
		Vowel v = new Vowel();
		// calling method
		v.m1(ch);
		
		
	}

}
