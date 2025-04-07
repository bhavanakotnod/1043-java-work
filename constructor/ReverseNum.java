package com.constructor;

public class ReverseNum {
	//parameter passed constructor
	public ReverseNum(int n) {
		int rev=0;       // initially reverse = 0 
		int rem;        // reminder
		for(int i =0 ; i<=n;i++) {
			rem = n%10;       
			rev = rev*10+rem;
			n=n/10;
			
		}
		System.out.println("reverse for given number  "+" = "+rev);
	}
	public static void main(String[] args) {
		ReverseNum r =new ReverseNum(5436);
		ReverseNum r1 =new ReverseNum(98234);
	}

}
