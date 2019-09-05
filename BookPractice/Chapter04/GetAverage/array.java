/*
2019-02-04
어서와 Java는 처음이지!
chapter4
5명의 성적을 입력받아 그 성적의 평균을 구하는 프로그램
*/

package get_average;

import java.util.Scanner;

public class array {

	private static Scanner cx;

	public static void main(String[] args) {
		
		int[] score = new int[5];
		cx = new Scanner(System.in);
		int tem=0, avg;
		
		for(int i=0; i < 5; i++)
		{
			System.out.print("성적을 입력하시오: ");
			score[i] = cx.nextInt();
		}
		
		for(int i=0; i < 5; i++)
		{
			tem += score[i];
		}
		
		avg = tem / 5;
		
		System.out.println("평균성적은 " + avg + "입니다.");
	}

}
