package ArgumentConstructor;

public class Book {
	public Book (String Book_Name,String author,double Price) {
		System.out.println("Book Name "+ Book_Name);
		System.out.println("Author of the Book "+author);
		System.out.println("Price of the book "+ Price);
	}
	public static void main(String[] args) {
		Book b = new Book("The complete adventures of feluda","Satyajit Ray",200.25);
		System.out.println("-------------------");
		Book b1 = new Book("The world as I see it","Albert Einstein",220.25);
		
	}

}
