package ArgumentConstructor;

public class Employee {
	public Employee(int EmpId,String EmpName,String salary) {
		System.out.println("Employee ID " +EmpId);
	    System.out.println("Employee Name "+EmpName);
		System.out.println("Employee salary  "+ salary);
			
	}
	public static void main(String[] args) {
		Employee e = new Employee(1023,"Bhavana", "9LPA");
		System.out.println("-------------------------------");
		Employee e1 = new Employee(1024,"Shruti", "8LPA");
		System.out.println("-------------------------------");
		Employee e2 = new Employee(1025,"Bhumi", "13LPA");
	}

}
