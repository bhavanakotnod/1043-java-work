package com.constructor;

public class EvenOdd {
	// constructor
	public EvenOdd() {
		int n=54; 
		if(n%2==0) {
			System.out.println(n +" number is even");
		}
		else {
			System.out.println(n+ "  number is odd");
		}
	}
	// parameterized method m1
	public void m1(int n) {
		// n > 0 then number is positive
		if(n>0) {
			System.out.println(n+" number id positive");
		}
			// (-n) < 0 < (+n)
		else if(n<0) {
			System.out.println(n+" number is negative");
		}
		else {
			System.out.println(n+" number is zero");
		}
	}
	
	//main method
	public static void main(String[] args) {
		//object creation
		EvenOdd e = new EvenOdd();
		e.m1(5);
	}

}

