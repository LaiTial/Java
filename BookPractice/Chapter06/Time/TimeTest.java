package time;

public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Time a, b, c;
		
		a = new Time();
		b = new Time(13, 27, 6);
		c = new Time(25, -1, 3);
		
		System.out.println("�⺻ ������ ȣ�� �� �ð�: " + a);
		System.out.println("�ι�° ������ ȣ�� �� �ð�: " + b);
		System.out.println("�ùٸ��� ���� �ð� ���� �� �ð�: " + c);
	}

}
