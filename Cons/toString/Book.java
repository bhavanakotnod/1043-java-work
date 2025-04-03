package Cons.toString;

public class Book {
	String book_name;  // global variable/ fields
	String author;
	double price;
	
	// Parameterized  constructor 
	public Book(String book_name,String author,double price) {
		this.book_name = book_name;
		this.author =author;
		this.price =price;
	}
	
	
	
	@Override
	public String toString() {         // return a string representation of object
		return "Book [book_name = " + book_name + ", author = " + author + ", price = " + price + "]";
	}



	public static void main(String[] args) {
		Book b = new Book("Malgudi Days.","R K Narayana", 300.30);
		System.out.println(b);
		System.out.println("----------------------------------");
		Book b1 = new Book("Gitanjali.","Rabindraanth Tagore", 250.30);
		System.out.println(b1); 
		
	}

}

