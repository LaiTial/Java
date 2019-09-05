/*
2019-02-04
어서와 Java는 처음이지!
chapter4
탐색할 값을 입력받아 그 값을 배열에서 찾아서 그 위치를 출력하는 프로그램
*/

package search;

import java.util.Scanner;

public class Seqsearch {

	public static void main(String[] args) {
		
		int[] s = {12, 3, 19, 6, 18, 22, 11, 7, 17, 5};
		int temp, key = 0;
		Scanner cx = new Scanner(System.in);
		
		System.out.print("탐색할 값을 입력하시오: ");
		temp = cx.nextInt();
		
		for(int i=0; i< s.length; i++)
		{
			if(s[i] == temp)
			{
				key = i;
				break;
			}
		}
		
		if(key < 0)
		{
			System.out.println("값을 찾을 수 없습니다.");
		}
	
		else
		System.out.println(temp + "값은 " + key + "위치에 있습니다.");
	}

}
