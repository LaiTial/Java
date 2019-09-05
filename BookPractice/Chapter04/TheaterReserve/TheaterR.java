/*
*/
package Theater;

import java.util.Scanner;

public class TheaterR {

	private static final boolean True = false;
	private static Scanner cx;

	public static void main(String[] args) {
		
		int[] r = new int[10];
		int gg = 0;
		P_reserve vd = new P_reserve();
		cx = new Scanner(System.in);
		
		
		do
		{
			for(int i = 0; i < r.length; i++)
			{
				if(r[i] == 0)
				{
					break;
				}
				
				if(r[r.length-1] == 1)
				{
					System.out.println("극장의 모든 자리가 예약되었습니다. 다음에 다시 찾아 주십시오.");
					return;
				}
			}
			
			vd.res(r);
				
			System.out.print("원하시는 좌석번호를 입력하시오: ");
			gg = cx.nextInt();
			
			
			if((gg < 0) || (gg > 10))
			{
				System.out.println("제대로된 좌석번호가 아닙니다. 다시 입력하십시오.");
				continue;
			}
			
			else
			{
				if(r[gg-1] == 1)
				{
					System.out.println("이미 예약된 자리입니다.\n");
				}
				
				else
				{
					r[gg-1] = 1;
					System.out.println("예약되었습니다.\n");
				}
			}
			
		}while(gg != -1);
	}

}
