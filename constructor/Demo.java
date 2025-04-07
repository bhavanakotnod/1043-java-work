package com.constructor;

public class Demo {
	{
		System.out.println("this is non static block");
	}
	static {
		System.out.println("this is static block");
	}
	
	//cretae constuctor
	public Demo() {
		System.out.println("this is constructor...");
	}
	public void m1() {
		System.out.println("this is method...");
	}
	
	public static void main(String[] args) {
		Demo d = new Demo();         // object creation (object of the class
		d.m1();
	}
		
	

}
