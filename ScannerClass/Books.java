package ScannerClass;

import java.util.Scanner;

public class Books {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the title of book");
		String title = sc.nextLine();
		System.out.println("enter the author of book");
		String author = sc.nextLine();
		System.out.println("enter the price of book");
		double price = sc.nextDouble();

		Book_Details b = new Book_Details(70, title);
		b.issueBook();
		b.returnBook();
		b.displayBookDetails();

	}

}
