package com.polymorphism;

public class Eagle extends Bird {
	public void fly() {
		System.out.println("eagle have more flying speed than sporrow");
	}
	public static void main(String[] args) {
		Bird b = new Bird();
		b.fly();
		
		Sparrow s = new Sparrow();
		s.fly();
		
		Eagle e = new Eagle();
		e.fly();
	
	}

}
