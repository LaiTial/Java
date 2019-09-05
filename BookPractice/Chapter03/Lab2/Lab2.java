/*
2019-01-27
어서와 Java는 처음이지!
chapter3
현재 시간을 구해 그 시간에 따라 적절한 인사말을 출력하는 프로그램
*/

package lab2;

import java.util.Date;

public class Lab2 {

	public static void main(String[] args) {
		
		int c_h; //현재시간
		
		Date date = new Date();
		c_h = date.getHours();
		
		System.out.println("현재시간은 "+c_h);
		
		if(c_h < 11)
			System.out.println("Good morning");
		
		else if(c_h < 15)
			System.out.println("Good afternoon");
		
		else if(c_h < 20)
			System.out.println("Good evening");
		
		else
			System.out.println("Good night");
	}

}
