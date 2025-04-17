package abstraction;

public class Cow implements Animal{
         public void sound() {
        	 System.out.println("Cow sounds Moo-Moo");
         }
         public void color() {
        	 System.out.println("colour of cow is Black");
         }
         
         public static void main(String[] args) {
			Dog d =new Dog();
			d.sound();
			d.color();
			System.out.println("--------------------------------------");
			Cow c = new Cow();
			c.sound();
			c.color();
			System.out.println("--------------------------------------");
			Cat t =new Cat();
			t.sound();
			t.color();
		}
}
