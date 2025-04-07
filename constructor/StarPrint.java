package com.constructor;

public class StarPrint {
	
	public StarPrint(int n) {
		for(int i = 1;i<=n;i++) {
			for (int j=i;j<=n;j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		
	}
	
	
	public void m1(int n) {
		for(int i =n;i>=1;i--) {
			for(int j = i;j<=n;j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		System.out.println("upper triangular matrix");
		StarPrint s = new StarPrint(5);
		System.out.println("lower triangular matrix");
		s.m1(5);
	}
	

}
