package Array;

import java.util.Scanner;

public class ArrayProc {

	Scanner cx = new Scanner(System.in);
	
	void getValues(int[] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			System.out.print("성적을 입력하시오: ");
			array[i] = cx.nextInt();
		}
	}
	
	double getAverage(int[] array)
	{
		double sum = 0;
		
		for(int i = 0; i < array.length; i++)
		{
			sum += array[i];
		}
		
		return (sum/array.length);
	}
}
