package abstraction;


public class Circle implements Shape {
	double pi = 3.14;
	double radius;
	Circle(double radius){
		//this.pi= pi;
		this.radius = radius;
	}

	@Override
	public void area() {
		

		 double circleArea = pi*radius*radius;
		System.out.println("Area circle " + circleArea);
		
	}

}
