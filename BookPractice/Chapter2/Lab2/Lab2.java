/*
2019-01-20
어서와 Java는 처음이지!
chapter2
빛의 속도를 구해 그것을 출력하는 프로그램
*/

package lab2;

public class Lab2 {

	public static void main(String[] args) {
		
		final double spee = 30e4;
		double dis = 40e12;
		
		double result;
		
		result = dis / spee;
		
		double light_year = result/(60.0*60.0*24.0*365.0);
		
		System.out.println("걸리는 시간은 "+light_year+" 광년입니다.");
	}

}
