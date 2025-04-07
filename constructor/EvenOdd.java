package com.constructor;

public class EvenOdd {
	
	public EvenOdd() {
		int n=54; 
		if(n%2==0) {
			System.out.println(n +" number is even");
		}
		else {
			System.out.println(n+ "  number is odd");
		}
	}
	public void m1(int n) {
		if(n>0) {
			System.out.println(n+" number id positive");
		}
		else if(n<0) {
			System.out.println(n+" number is negative");
		}
		else {
			System.out.println(n+" number is zero");
		}
	}
	
	
	public static void main(String[] args) {
		EvenOdd e = new EvenOdd();
		e.m1(5);
	}

}
