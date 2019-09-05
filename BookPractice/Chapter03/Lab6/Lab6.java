/*
2019-02-02
어서와 Java는 처음이지!
chapter3
난수의 합 계산하기
0-99사이의 난수를 입력받은 개수만큼 만든 후 그 합을 출력하는 프로그램
*/

package rand_number_plus;
import java.util.*;

public class Lab6 {

	public static void main(String[] args) {
		
		int temp, hh, sum=0;
		
		Scanner cx = new Scanner(System.in);
		
		System.out.print("난수의 개수: ");
		hh = cx.nextInt();
		
		Random rand = new Random();
		
		for(int i=0; i < hh; i++)
		{
			temp = rand.nextInt(100);
			sum += temp;
		}
		
		System.out.println("난수 " + hh + "개의 합은 " + sum);
	}
}
