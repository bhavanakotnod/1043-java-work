package ArgumentConstructor;

public class Movie {
	public Movie(String name,String genre,String rating) {
		System.out.println("movie name "+ name);
		System.out.println("movie genre "+ genre);
		System.out.println("movie rating "+ rating);
	}
	public static void main(String[] args) {
		Movie m = new Movie("Munjja","Horror"," 4 start");
		System.out.println("----------------------");
		Movie m1 = new Movie("Chhava","Historic"," 5 start");
	}

}
