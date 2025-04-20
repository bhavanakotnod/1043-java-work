package abstraction;


public class Rectangle implements Shape {
	int length;
	int width;
	Rectangle(int length, int width){
		this.length = length;
		this.width = width;
	}

	@Override
	public void area() {
		int rectangleArea = length*width;
		System.out.println("area of rectangle is  "+rectangleArea);
				
		
		
	}
	

}
