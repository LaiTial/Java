/*
2019-01-27
어서와 Java는 처음이지!
chapter3
일수를 알고 싶은 월을 입력받아 그 월의 일수를 알려주는 프로그램
*/

package lab3;

import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		
		int month, day;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("일수를 알고 싶은 월을 선택하시오: ");
		month = input.nextInt();
		
		switch(month)
		{
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			day = 31;
			break;
		case 2:
			day = 28;
			break;
		case 4: case 6: case 9: case 11:
			day = 30;
			break;
			default:
				day = 0;
		}
		
		System.out.println("월의 일수는 "+day);
	}

}
