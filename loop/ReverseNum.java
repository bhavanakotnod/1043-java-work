package com.tka.loop;

public class ReverseNum {
	public static void main(String[] args) {
		int n = 1234;
		int reverse = 0;
		int reminder;
		for ( ;n!= 0 ;) {
			reminder = n%10;
		reverse =reverse * 10 + reminder;
		n = n/10;
				
		}
		System.out.println(reverse);
	}
}
