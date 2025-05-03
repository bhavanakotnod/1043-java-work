package com.tka.loop;

public class FactorialNum {
	public static void main(String[] args) {
		int n =5;          
		
		int fact=1;
		for(int i = 1 ; i <= n ; i++)      // loop rotated 5 times 
			fact = fact*i ;           // 1*2*3*4*5  = 120
		System.out.println(fact);
	}

}
