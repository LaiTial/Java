
public class Comparable_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle n1 = new Rectangle(100, 30);
		Rectangle n2 = new Rectangle(200, 10);
		

		if(n1.compareTo(n2) > 0)
			System.out.println(n1.toString() + "�� �� Ů�ϴ�.");
		
		else if(n1.compareTo(n2) == 0)
			System.out.println("���� �����ϴ�.");
		
		else
			System.out.println(n2.toString() + "�� �� Ů�ϴ�.");
	}

}
