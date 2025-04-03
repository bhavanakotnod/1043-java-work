package Cons.toString;



public class Circle {
	double radius;
	public Circle(double radius) {
		this.radius = radius;
		double pi =3.14;
		double area = pi*radius*radius;
		
		System.out.println("Area of circle "+ area);
		
	}
	
	@Override
	public String toString() {
		return "Circle [radius = " + radius + "]";
	}

	public static void main(String[] args) {
		Circle c = new Circle(4); 
		System.out.println(c);
		System.out.println("--------------------------------");
		Circle c1 = new Circle(7); 
		System.out.println(c1);
	}

}
