package Dynamic;

public class DynamicCallTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal s1 = new Animal();
		Dog s2 = new Dog();
		Cat s3 = new Cat();
		
		Animal tenp;
		
		tenp = s1;
		s1.sound();
		
		tenp = s2;
		tenp.sound();
		
		tenp = s3;
		tenp.sound();
	}

}
