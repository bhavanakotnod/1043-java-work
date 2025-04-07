package com.constructor;

public class Product_Details {
	
	    public static void main(String[] args) {
	        // Create a new product
	        Product product1 = new Product(101, "Laptop", 1200.00, 50);
	        Product product2 = new Product(102, "Smartphone", 800.00, 30);

	        // Display product details
	        product1.displayProductDetails();
	        product2.displayProductDetails();

	        // Purchase products
	        product1.purchaseProduct(10);  // Purchasing 10 units of Laptop
	        product2.purchaseProduct(35);  // Attempting to purchase 35 units of Smartphone (only 30 available)
	        product2.purchaseProduct(5);   // Purchasing 5 units of Smartphone

	        // Add stock
	        product1.addStock(20);  // Adding 20 units of Laptop to stock
	        product2.addStock(10);  // Adding 10 units of Smartphone to stock

	        // Display updated product details
	        product1.displayProductDetails();
	        product2.displayProductDetails();
	    }
	}



