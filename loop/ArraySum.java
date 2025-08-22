package com.tka.loop;
import java.util.Scanner;

public class ArraySum {
	public static void main(String args[]) {
	Scanner sc = new Scanner (System.in);
	 // Read size of array
	System.out.println("enter size of an array...");
	int n =sc.nextInt();
	int arr[]= new int[n];

    // Read array elements
	System.out.println("enter array elements....");
	for(int i =0;i<n;i++) {
		
		arr[i] =sc.nextInt();
	}

    // Calculate sum
	int sum =0;
	for(int i =0;i<n;i++) {
		sum +=arr[i];
	}

    // Print result4
	
	System.out.println(sum);
	}

}
