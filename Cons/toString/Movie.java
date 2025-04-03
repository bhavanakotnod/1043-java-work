package Cons.toString;

public class Movie {
	String name;
	String genre;
	String rating;
	public Movie(String name,String genre,String rating) {
		this.name = name;
		this.genre = genre;
		this.rating =rating;
	}
	
	@Override
	public String toString() {
		return "Movie [name = " + name + ", genre = " + genre + ", rating = " + rating + "]";
	}

	public static void main(String[] args) {
		Movie m = new Movie("Munjja","Horror"," 4 start");
		System.out.println(m);
		System.out.println("----------------------");
		Movie m1 = new Movie("Chhava","Historic"," 5 start");
		System.out.println(m1);
	}
}
