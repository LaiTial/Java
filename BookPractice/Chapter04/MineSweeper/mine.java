/*
2019-02-06
어서와 Java는 처음이지!
chapter4
랜덤으로 30% 이하의 확률로 지뢰 모양 판을 만드는 프로그램
*/

package minesweeper;

import java.util.Arrays;
import java.util.Random;

public class find_mine {

	public static void main(String[] args) {
		
		char[][] c = new char[10][10];
		Random tt = new Random();
		
		for(int i = 0; i < 10; i++)
		{
			for(int j=0; j < 10; j++)
			{
				if(tt.nextInt(10) < 3)
				{
					c[i][j] = '#';
				}
				
				else {
					c[i][j] = '.';
				}
			}
		}
		
		
		for(int i = 0; i < 10; i++)
		{
			for(int j=0; j < 10; j++)
			{
				System.out.print(c[i][j] + " ");
			}
			System.out.println("");
		}
	}

}
