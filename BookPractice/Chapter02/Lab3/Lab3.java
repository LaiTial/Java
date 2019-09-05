/*
2019-01-20
어서와 Java는 처음이지!
chapter2
방정식의 근의 공식을 활용해 근을 구하는 프로그램
*/

package lab3;

public class Lab3 {

	public static void main(String[] args) {
		
		double temp, sqr;
		double a=1.0, b=-3.0, c=2.0;
		double r1, r2;
		
		temp = b*b - 4.0*a*c;
		sqr = Math.sqrt(temp);
		
		r1 = (-b + sqr) / (2*a);
		r2 = (-b - sqr) / (2*a);
		
		System.out.println("근은 "+r1);
		System.out.println("근은 "+r2);
	}

}
