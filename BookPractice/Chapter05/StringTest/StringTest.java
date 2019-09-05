package str;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		
		String cx;
		Scanner cc = new Scanner(System.in);
		
		do
		{
			System.out.print("문자열을 입력하세요 > ");
			cx = cc.nextLine();
			
			if(cx.equals("quit")==true)
			{
				System.out.println("시스템을 종료합니다.");
				break;
			}
			
			if(cx.matches("^www\\.(.+)")==true)
			{
				System.out.println(cx + "은 'www'로 시작합니다.\n");
			}
			
			else
				System.out.println(cx + "는 'www'로 시작하지 않습니다.\n");
			
		}while(cx != "quit");
	}

}
