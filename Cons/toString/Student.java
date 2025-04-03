package Cons.toString;

public class Student {
	String name ;
	int age ;
	public Student(String name,int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	public static void main(String[] args) {
		Student s = new Student("Bhavana",18);
		System.out.println(s);
		
	}
	

}
