/*
2019-02-02
어서와 Java는 처음이지!
chapter3
숫자 추측 게임
사용자가 숫자를 입력할때 그게 정답보다 높은지 낮은지를 알려주고
정답을 맞췄을 때 시도 횟수를 알려주면서 게임을 종료한다
*/

package Numbergame;

import java.util.Scanner;

public class Lab7 {

	public static void main(String[] args) {
		
		int guess, i=0;
		final int answer = 49;
		
		Scanner cx = new Scanner(System.in);
		
		do
		{
			System.out.print("정답을 추측하여 보시오: ");
			guess = cx.nextInt();
			i++;
			
			if(guess > answer)
			{
				System.out.println("제시한 정수가 높습니다.");
				System.out.println("");
			}
			
			else if(guess < answer)
			{
				System.out.println("제시한 정수가 낮습니다.");
				System.out.println("");
			}
			
			else
			{
				System.out.println("축하합니다. 시도횟수 = " + i);
			}
		}while(answer != guess);

	}

}
