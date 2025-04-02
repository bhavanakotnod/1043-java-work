package ArgumentConstructor;

public class Rectangle {
	public Rectangle(int length, int width) {
		int area = length*width;
		System.out.println("Length of rectangle "+ length);
		System.out.println("width of rectangle "+ width);
		System.out.println("Area of rectangle "+ area);
	}
	public static void main(String[] args) {
		Rectangle r = new Rectangle(20,21) ;
		System.out.println("--------------------------");
		Rectangle r1 = new Rectangle(12,10) ;
		
		
	
		
	}

}
