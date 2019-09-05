/*
2019-01-20
어서와 Java는 처음이지!
chapter2
사각형의 가로와 세로의 길이를 입력받아 넓이와 둘레를 구하는 프로그램
*/

package lab5;
import java.util.*;

public class Lab5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double w, h;
		double area, per;
		
		System.out.print("사각형의 가로를 입력하시오: ");
		w = input.nextDouble();
		System.out.print("사각형의 세로를 입력하시오: ");
		h = input.nextDouble();
		
		area = w*h;
		per = 2*(w+h);
		
		System.out.println("사각형의 넓이는 "+area);
		System.out.println("사각형의 둘레는 "+per);
	}

}
