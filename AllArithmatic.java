// parameterized method used to perform a different type of arithmatic operations
public class AllArithmatic {
	public static void main(String[] args) {
		int add = myAdd(11, 98);
		AllArithmatic.myAvg( add);
		AllArithmatic.myDis(add);
		int minus = AllArithmatic.mySub(add,6);
		int multi = myMul(minus);
		myDiv(multi);
			
	}
	// for addition
	public static int myAdd(int a,int b) {
		int c = a+b;
		System.out.println("sum is "+ c);
		return c;
		
	}
	// finding average of two number
	public static float myAvg(int add) {
		float avg  =(float) add/2;
		System.out.println("average " + avg);
		return avg;
	}
	//discount on above average
	public static float myDis(float avg) {
		float dis = avg % 10;
		System.out.println("discount is "+dis);
		return dis;
	}
	// substraction 
	public static int mySub(int add,int d) {
		int sub = add - d;
		System.out.println("Sub is " +sub);
		return sub;
	}
	//multiplication 
	public static int myMul(int minus) {
		int mul = minus* 2;
		System.out.println("multi... "+ mul);
		return mul;
	}
	// Division
	public static float myDiv(int multi) {
		int div = multi%4;
		System.out.println("Division is "+div);
		return div;
	}
	

}
