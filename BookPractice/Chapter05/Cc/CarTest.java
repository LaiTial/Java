/*
2019-02-10
어서와 Java는 처음이지!
chapter5
car 객체를 만들어 값 할당 후 출력하는 프로그램
*/

package Cc;

public class CarTest {

	public static void main(String[] args) {
		Car cx = new Car();
		cx.colro = "red";
		cx.gear = 30;
		cx.speed = 100;
		
		System.out.println(cx.tostring());
		
		cx.changeGear(70);
		cx.speedDown();
		
		System.out.println(cx.tostring());
		System.out.println(cx.toString());
	}

}
