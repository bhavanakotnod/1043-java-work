package com.constructor;

public class VowelCon {
	
	// using switch case check the alphabet is vowel or consonant with its ASCII value
	
	public VowelCon() {
		int ch = 'A';
		switch(ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println(" vowel....");
			break;
			default:
				System.out.println(" consonant...."); 
					
		}
	}
	public static void main(String[] args) {
		VowelCon v = new VowelCon();
		
		
	}

}
