/*
2019-02-04
어서와 Java는 처음이지!
chapter3
로또 1등 당첨될 확률을 구해 출력한다
*/

package lottery;

public class lab8 {

	public static void main(String[] args) {
		
		long result, temp = 1;
		long be_sum = 1;
		
		for(int i=6; i > 0; i--)
		{
			temp *= i;
		}
		
		for(int i=45; i > 39; i--)
		{
			be_sum *= i;
		}
		
		result = be_sum / temp;
		
		System.out.println("로또 1등 확률: " + result);
	}

}
