package com.constructor;

public class Book {
	// Book class definition
	
	    private int bookId;
	    private String title;
	    private String author;
	    private double price;
	    private int availableCopies;

	    // Constructor to initialize book details
	    public Book(int bookId, String title, String author, double price, int availableCopies) {
	        this.bookId = bookId;
	        this.title = title;
	        this.author = author;
	        this.price = price;
	        this.availableCopies = availableCopies;
	    }

	    // Method to issue a book
	    public boolean issueBook() {
	        if (availableCopies > 0) {
	            availableCopies--;
	            System.out.println("Book '" + title + "' issued successfully.");
	            return true;
	        } else {
	            System.out.println("Sorry, no copies of '" + title + "' are available.");
	            return false;
	        }
	    }

	    // Method to return a book
	    public void returnBook() {
	        availableCopies++;
	        System.out.println("Book '" + title + "' returned successfully.");
	    }

	    // Method to display book details
	    public void displayBookDetails() {
	        System.out.println("Book ID: " + bookId);
	        System.out.println("Title: " + title);
	        System.out.println("Author: " + author);
	        System.out.println("Price: $" + price);
	        System.out.println("Available Copies: " + availableCopies);
	    }
	

	
	
	  
	}



