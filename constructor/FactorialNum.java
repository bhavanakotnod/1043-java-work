package com.constructor;

public class FactorialNum {
	int n =5;        //factorial number of 5 number
	int fact=1;    // global variable
	
	public FactorialNum() {
		for(int i=1;i<=n;i++) {
			fact =fact*i;          // logic for factorial number
			System.out.println( fact);
		}
	}
	public static void main(String[] args) {
		FactorialNum f = new FactorialNum();     //constructor of the same class with object creation
		
	}

}
