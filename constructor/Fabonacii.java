package com.constructor;

public class Fabonacii {
	// fabonacii series where next term is the sum of previous two term
	public Fabonacii(int n)    // int n is the parameter
	{
		int  a=0;    //first number is 0
		int b =1;     // second number is 1
		for(int i =1;i<=n;i++) {
			b=a+b;        // b = 0+1 ==1 , 1+1=2  ,2+1 = =3
			a=b-a;        // a = 1-0==1   // a = 2 -1 == 1  // a=3-1==2
			System.out.println(a);
		}
	}
	public static void main(String[] args) {
		Fabonacii f = new Fabonacii(10);   // n = 10
	}

}
