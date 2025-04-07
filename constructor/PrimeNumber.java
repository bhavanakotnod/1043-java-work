package com.constructor;

public class PrimeNumber {
	public PrimeNumber(int n) {
		int temp =0;
		for(int i = 2;i<n;i++) {
			if(n%i==0) {
				temp=temp+1;
				
			}
		}
		if(temp>0) {
			System.out.println("NOt a prime number");
		}else {
			System.out.println("number is prime");
		}
		
	}
	public static void main(String[] args) {
		PrimeNumber p = new PrimeNumber(11);
		
	}

}
