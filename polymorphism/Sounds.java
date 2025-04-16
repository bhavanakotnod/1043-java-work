package com.polymorphism;

//method override 
//different class (inherited class) (extends keyword), same method name , same parameter 

public class Sounds  extends Animal{
	public void sound() {
		System.out.println("sound of cat Meow-Meow");
	}
	public static void main(String[] args) {
		Animal a = new Animal();     // Super class animal
		a.sound();
		
		Sounds s = new Sounds();    // sub class sound
		s.sound();  
	}

}
