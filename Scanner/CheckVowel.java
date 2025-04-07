package com.Scanner;
import java.util.Scanner;
public class CheckVowel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character");
		char ch = sc.next().charAt(0);
		
		Vowel v = new Vowel();
		v.m1(ch);
		
		
	}

}
