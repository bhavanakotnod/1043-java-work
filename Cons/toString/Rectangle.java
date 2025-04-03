package Cons.toString;

public class Rectangle {
	int length;
	int width;
	double area;
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
		area = length*width;
		System.out.println(area);
			
	}
	
	@Override
	public String toString() {
		return "Rectangle [length = " + length + ", width = " + width + "]";
	}
	public static void main(String[] args) {
		
		Rectangle r = new Rectangle(20,21) ;
		System.out.println(r);
		System.out.println("--------------------------");
		Rectangle r1 = new Rectangle(12,10) ;
		System.out.println(r1);
		
			
	}

}
