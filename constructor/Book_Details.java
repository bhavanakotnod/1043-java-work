package com.constructor;

public class Book_Details {
	  public static void main(String[] args) {
	        // Creating Book objects
	        Book book1 = new Book(101, "Java Programming", "John Doe", 39.99, 5);
	        Book book2 = new Book(102, "Python Programming", "Jane Smith", 29.99, 3);

	        // Displaying book details
	        System.out.println("Book Details:");
	        book1.displayBookDetails();
	        System.out.println();
	        book2.displayBookDetails();
	        System.out.println();

	        // Issuing books
	        book1.issueBook();
	        book2.issueBook();
	        book2.issueBook();
	        book2.issueBook();
	        book2.issueBook(); // This should show that no copies are available

	        // Displaying updated details after issuing
	        System.out.println("\nUpdated Book Details after issuing books:");
	        book1.displayBookDetails();
	        System.out.println();
	        book2.displayBookDetails();
	        System.out.println();

	        // Returning books
	        book1.returnBook();
	        book2.returnBook();

	        // Displaying updated details after returning books
	        System.out.println("\nUpdated Book Details after returning books:");
	        book1.displayBookDetails();
	        System.out.println();
	        book2.displayBookDetails();
	    }
}
