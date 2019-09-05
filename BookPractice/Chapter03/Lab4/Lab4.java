/*
2019-02-02
어서와 Java는 처음이지!
chapter3
두 수를 입력받아 두 수의 최대 공약수를 구하는 프로그램
*/

package gcd;
import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args) {
		
		int a, b, c;
		
		Scanner cx = new Scanner(System.in);
		
		System.out.print("두개의 정수를 입력하시오(큰 수, 작은 수): ");
		a = cx.nextInt();
		b = cx.nextInt();
		
		while(b != 0)
		{
			c = a % b;
			a = b;
			b = c;		
		}
		
		System.out.println("최대 공약수는 "+ a);
	}

}
