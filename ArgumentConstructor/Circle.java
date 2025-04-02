package ArgumentConstructor;

public class Circle {
	public Circle(double radius) {
		double pi =3.14;
		double area = pi*radius*radius;
		System.out.println("radius of circle "+radius);
		System.out.println("Area of circle "+ area);
		
	}
	public static void main(String[] args) {
		Circle c = new Circle(4); 
		System.out.println("--------------------------------");
		Circle c1 = new Circle(7); 
	}

}
