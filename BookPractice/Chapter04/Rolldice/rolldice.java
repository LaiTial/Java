/*
2019-02-04
어서와 Java는 처음이지!
chapter4
주사위를 10000번을 돌려 어떤 면이 몇 번 나왔는지 기록하는 프로그램
*/

package sequ;

import java.util.Random;

public class rolldice {

	public static void main(String[] args) {
		
		make_box cx = new make_box();
		int[] seq = new int[6];
		Random ha = new Random();
		int temp;
		
		cx.box();
		
		System.out.println("면    빈도");
		
		cx.box();
		
		for(int i=0; i<10000; i++)
		{
			temp = ha.nextInt(6);
			seq[temp]++;
		}
		
		for(int i=0; i<6; i++)
		{
			System.out.println((i+1) + "    " + seq[i]);
		}

	}

}
