package ArgumentConstructor;

public class Student {
	public Student(String name,int age) {
		System.out.println("Name of student"+name);
		System.out.println("age of student"+age);
	}
	public static void main(String[] args) {
		Student s = new Student("Bhavana",21);
		System.out.println("---------------------");
		Student s1 = new Student("Shruti",22);
		System.out.println("---------------------");
		Student s2 = new Student("Rupali",21);
		
	}

}
