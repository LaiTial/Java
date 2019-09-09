
public class Comparable_check {

	public static void main(String[] args) {
		
		Rectangle n1 = new Rectangle(100, 30);
		Rectangle n2 = new Rectangle(200, 10);
		

		if(n1.compareTo(n2) > 0)
			System.out.println(n1.toString() + "가 더 큽니다.");
		
		else if(n1.compareTo(n2) == 0)
			System.out.println("둘은 같습니다.");
		
		else
			System.out.println(n2.toString() + "가 더 큽니다.");
	}

}
