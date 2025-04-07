package com.constructor;

public class TableNum {
	// parameter passing in constructor
	
	public TableNum(int n) {
		System.out.println("table for "+n);
		for(int i=1;i<=10;i++) {
			System.out.println(n*i); 
			
		}
		
		
	}
	public static void main(String[] args) {
		TableNum t = new TableNum(7);
	}

}
