package Box;

public class BoxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Box obj1, obj2;
		obj1 = new Box(24, 26, 30);
		obj2 = new Box(25, 26, 30);
		
		System.out.println("obj1 == obj2 : " + obj2.isSameBox(obj1));
	}

}
