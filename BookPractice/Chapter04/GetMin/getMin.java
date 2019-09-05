/*
2019-02-04
어서와 Java는 처음이지!
chapter4
10개의 배열에 저장된 값들 중에서 최소값을 찾아내는 프로그램
*/

package find_tw;

public class getMin {

	public static void main(String[] args) {
		
		int[] s = {12, 3, 19, 6, 18, 22, 11, 7, 17, 5};
		int temp = 100;
		
		for(int i=0; i< s.length; i++)
		{
			if(s[i] < temp)
			{
				temp = s[i];
			}
		}
		
		System.out.println("최소값은 " + temp + "입니다.");
	}

}
