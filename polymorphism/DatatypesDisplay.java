package com.polymorphism;

public class DatatypesDisplay {
	public void display(String a,String b) {
		System.out.println("Display String data type  "+a+" "+b);
	}
	public void display (int a ,int b) {
		System.out.println("display interger data type  "+a +" "+ b);
	}
	public void display(int a, String s) {
		System.out.println("Display interger and String together   "+a+" " + s);
	}
	public static void main(String[] args) {
		DatatypesDisplay d = new DatatypesDisplay();
		d.display("Bhavana", "Kotnod");
		d.display(3, 23);
		d.display(23, "Bhavana");
	}

}
