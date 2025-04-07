package com.constructor;

public class NumPrint {
	// number printing from 1 to 10 using while loop in constructor
	
	public  NumPrint(int n ) {
		int i= 1;        // loop start from 1
		while(i<=n) {
			System.out.println(i);
			i++;          // increment by 1
		}
		
	}
	public static void main(String[] args) {
		NumPrint n = new NumPrint(10);  //  end of the loop after printing 10 number
	}

}
