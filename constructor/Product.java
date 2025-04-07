package com.constructor;

public class Product {
	
	    private int productId;
	    private String productName;
	    private double price;
	    private int stock;

	    // Constructor
	    public Product(int productId, String productName, double price, int stock) {
	        this.productId = productId;
	        this.productName = productName;
	        this.price = price;
	        this.stock = stock;
	    }

	    // Method to purchase product (reduce stock)
	    public void purchaseProduct(int quantity) {
	        if (quantity > 0) {
	            if (stock >= quantity) {
	                stock -= quantity;
	                System.out.println("Purchased " + quantity + " of " + productName);
	            } else {
	                System.out.println("Not enough stock to purchase " + quantity + " units of " + productName);
	            }
	        } else {
	            System.out.println("Quantity must be greater than zero.");
	        }
	    }

	    // Method to add stock
	    public void addStock(int quantity) {
	        if (quantity > 0) {
	            stock += quantity;
	            System.out.println("Added " + quantity + " units of " + productName + " to stock.");
	        } else {
	            System.out.println("Quantity to add must be greater than zero.");
	        }
	    }

	    // Method to display product details
	    public void displayProductDetails() {
	        System.out.println("\nProduct ID: " + productId);
	        System.out.println("Product Name: " + productName);
	        System.out.println("Price: $" + price);
	        System.out.println("Stock: " + stock + " units");
	    }
	}



