package com.polymorphism;

public class Calculate {
	private void add(int a ,int b) {
		int sum = a+b;
		System.out.println("addition of two number "+sum);
	}
	public  void add(double a,double b) {
		double  sum = a+b;
		System.out.println("adding of two number "+sum);
	}
	public void add(int a,int b, int c) {
		int sum = a+b+c;
		System.out.println("addition of three number "+sum);
	}
	public static void main(String args[] ) {
		Calculate c = new Calculate();
		c.add(12, 21);
		c.add(21.0, 14.9);
		c.add(11,5, 8 );
	}

}
