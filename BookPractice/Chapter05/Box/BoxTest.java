/*
2019-02-10
어서와 Java는 처음이지!
chapter5
상자의 가로, 세로, 높이를 맴버로 갖는 객체를 만들어 
main 함수에서 호출하고 처리하는 프로그램
*/

package test;

public class BoxTest {

	public static void main(String[] args) {
		
		Box cx = new Box();
		
		cx.height = 30;
		cx.length = 20;
		cx.width = 20;
		
		System.out.println("상자의 가로, 세로, 높이는 "+ cx.width + ", " + cx.length + ", " + cx.height + "입니다." );
	}

}
