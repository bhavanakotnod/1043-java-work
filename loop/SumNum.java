package com.tka.loop;

public class SumNum {
	public static void main(String[] args) {
		int n = 10;
		int sum = 0;

		for (int i = 0; i <= n; i++)
			sum = ((n*(n+1))/2);
		System.out.println(sum);
	}

}
