package com.Encapsulation;

public class Book_Details {
	public static void main(String[] args) {
		Book b = new Book();
		
		 b.setBook_name("java");
		 b.setAuthor("james gosling");
		 b.setPrice(300.30);
		 b.setStock(7);
		 
		 System.out.println("name of the book "+(b.getBook_name()));
		 System.out.println("author of the book "+ (b.getAuthor()));
		 System.out.println("price of the book "+ (b.getPrice()));
		 System.out.println("stock "+ (b.getStock()));
		 
	}

}
