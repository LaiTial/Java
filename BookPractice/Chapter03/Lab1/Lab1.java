/*
2019-01-27
어서와 Java는 처음이지!
chapter3
성적을 입력받아 그 성적이 어느 학점인지 구해 출력하는 프로그램
*/

package lLab1;

import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
		
		int score;
		char lank;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("성적을 입력하시오: ");
		score = input.nextInt();
		
		if(score >= 90)
			lank = 'A';
		
		else if(score >=80)
			lank = 'B';
		
		else if(score >=70)
			lank = 'C';
		
		else if(score >=60)
			lank = 'D';
		
		else
			lank = 'F';
			
			
			
			
		System.out.println("학점 "+lank);
	}

}
