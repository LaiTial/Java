/*
2019-01-20
어서와 Java는 처음이지!
chapter2
반지름을 입력받아 원의 넓이를 구하는 프로그램
*/

package lab4;
import java.util.*;

public class Lab4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int radius;
		double res;
		
		System.out.print("반지름을 입력하시오: ");
		radius = input.nextByte();
		
		res = 3.14 * radius * radius;
		
		System.out.println(res);
	}
}
