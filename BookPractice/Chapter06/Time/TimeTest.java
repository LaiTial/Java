package time;

public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Time a, b, c;
		
		a = new Time();
		b = new Time(13, 27, 6);
		c = new Time(25, -1, 3);
		
		System.out.println("기본 생성자 호출 후 시간: " + a);
		System.out.println("두번째 생성자 호출 후 시간: " + b);
		System.out.println("올바르지 않은 시간 설정 후 시간: " + c);
	}

}
