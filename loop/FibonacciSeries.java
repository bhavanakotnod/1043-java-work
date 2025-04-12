package com.tka.loop;

public class FibonacciSeries {
	public static void main(String[] args) {
		int a=0;
		int b= 1;
		int c;
		int n =10;
		for(int i=1; i<=n;++i) {
			c=a+b;
		    a=b;
		    b=c;
		    System.out.println(c);
		}
	}
	
		
	
}

