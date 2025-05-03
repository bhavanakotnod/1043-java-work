package com.tka.loop;

public class FibonacciSeries {
	public static void main(String[] args) {
		// first number
		int a=0;
		// second number
		int b= 1;
		// store addition of two number
		int c;
		// series upto 10  number
		int n =10;
		for(int i=1; i<=n;++i) {
			c=a+b;
		    a=b;
		    b=c;
		    System.out.println(c);
		}
	}
	
		
	
}

