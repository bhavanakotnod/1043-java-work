package abstraction;

import java.util.Scanner;

public class ShapesArea {
	public static void main(String[] args) {
		System.out.println("Area of rectangle ......");

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the value of length  ");
		int length = sc.nextInt();
		System.out.println("enter the value of width   ");
		int width = sc.nextInt();
		Rectangle r = new Rectangle(length, width);
		r.area();
		
		System.out.println("Area of Circle......");
		System.out.println("enter the value of radius  ");
		double radius = sc.nextDouble();
         Shape c= new Circle(radius);
         c.area();
         
		
	}

}
