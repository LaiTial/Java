/*
2019-02-02
어서와 Java는 처음이지!
chapter3
숫자 하나를 입력 받아 그 수의 약수를 모두 출력하는 프로그램
*/

package divisor;

import java.util.Scanner;

public class Lab5 {

	public static void main(String[] args) {
		
		int x;
		
		Scanner cx = new Scanner(System.in);
		
		System.out.print("양의 정수를 입력하시오: ");
		x = cx.nextInt();
		
		System.out.println(x + "의 약수는 다음과 같습니다.");
		
		for(int i = 1; i <= x; i++)
		{
			if(x % i == 0)
			{
				System.out.print(i + " ");
			}
		}
		
		System.out.println("");
	}

}
