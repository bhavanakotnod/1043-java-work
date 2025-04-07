package com.Scanner;
import java.util.Scanner;
public class PositiveNeg {
	public void m1(int num) {
		if(num>0) {
			System.out.println("number is positive");
		}
		else if(num<0){
			System.out.println("number is negative"); 
			
		}
		else {
			System.out.println("number is zero");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		System.out.println("check a number is even or odd 5");
		PositiveNeg p =new PositiveNeg();
		p.m1(num);
		
	}

}
