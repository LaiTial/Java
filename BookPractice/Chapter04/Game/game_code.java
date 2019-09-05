/*
2019-02-06
어서와 Java는 처음이지!
chapter4
Tic-Tac-Toc 게임
*/

package game;

import java.util.Scanner;

public class game_code {

	public static void main(String[] args) {
				
		char[][] c = new char[3][3];
		workpench cx = new workpench();
		Scanner dd = new Scanner(System.in);
		int a, b;
		
		
		while(cx.check_ar(c)==0)
		{
			System.out.println("");
			cx.pan(c);
			
			
			System.out.println("다음 수의 좌표를 입력하시오: ");
			a = dd.nextInt();
			b = dd.nextInt();
		
			if(a < 3 && a >= 0)
			{	if(b < 3 && b >= 0)
				{
					if(c[a][b] == '\0')
					{
						c[a][b] = 'X';
					}
					
					else
					{
						System.out.println("다시 선택해 주세요.");
						continue;
					}
				}
			}
			
			else 
			{
				System.out.println("다시 선택해 주세요.");
				continue;
			}
			
			
			
			if(cx.check_ar(c)==1)
			{
				System.out.println("\nTic-Tac-Toc 게임이 완료되었습니다!");
				cx.pan(c);
				break;
			}
			
			cx.make_make(c);
		}
		

	}

}
