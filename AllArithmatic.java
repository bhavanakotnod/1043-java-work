
public class AllArithmatic {
	public static void main(String[] args) {
		int add = myAdd(11, 98);
		AllArithmatic.myAvg( add);
		AllArithmatic.myDis(add);
		int minus = AllArithmatic.mySub(add,6);
		int multi = myMul(minus);
		myDiv(multi);
			
	}
	public static int myAdd(int a,int b) {
		int c = a+b;
		System.out.println("sum is "+ c);
		return c;
		
	}
	public static float myAvg(int add) {
		float avg  =(float) add/2;
		System.out.println("average " + avg);
		return avg;
	}
	public static float myDis(float avg) {
		float dis = avg % 10;
		System.out.println("discount is "+dis);
		return dis;
	}
	public static int mySub(int add,int d) {
		int sub = add - d;
		System.out.println("Sub is " +sub);
		return sub;
	}
	public static int myMul(int minus) {
		int mul = minus* 2;
		System.out.println("multi... "+ mul);
		return mul;
	}
	public static float myDiv(int multi) {
		int div = multi%4;
		System.out.println("Division is "+div);
		return div;
	}
	

}
