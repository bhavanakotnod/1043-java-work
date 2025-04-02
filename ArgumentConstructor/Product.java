package ArgumentConstructor;

public class Product {
	public Product(int proId,String proName,Double ProPrice) {
		System.out.println("Product id"+proId);
		System.out.println("Product Name"+proName);
		System.out.println("Product Price"+ProPrice);
		
	}
	public static void main(String[] args) {
		Product p = new Product(123, "Biscuit",120.22);
		System.out.println("------------------");
		Product p1 = new Product(180, "KurKure",185.50);

	} 
	

}
