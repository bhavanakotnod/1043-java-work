package ScannerClass;

public class Book_Details {
	int availableCopies;
	String title;

	public Book_Details(int availableCopies, String title) {
		this.title = title;
		this.availableCopies = availableCopies;

	}

	public boolean issueBook() {
		if (availableCopies > 0) {
			availableCopies--;
			System.out.println("Book issued successfully.");
			return true;
		} else {
			System.out.println("Sorry, no copies of are available.");
			return false;
		}

	}
	public void returnBook() {
        availableCopies++;
        System.out.println("Book returned successfully.");
    }

    // Method to display book details
    public void displayBookDetails() {
        
        System.out.println("Title: " + title);
     
        System.out.println("Available Copies: " + availableCopies);
    }
}