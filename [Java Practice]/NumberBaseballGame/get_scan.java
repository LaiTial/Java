package number_baseball_game;

import java.util.Scanner;

public class get_scan {
	
	int scan[] = new int[3];
	Scanner input = new Scanner(System.in);
	
	public get_scan()
	{
		get_scan_rand();
	}
	
	public int[] getScan() {
		return scan;
	}

	public void get_scan_rand()
	{
		for(int i=0; i<3; i++)
		{
			scan[i] = input.nextInt();
		}
	}
	
	public boolean ScanCheck()
	{
		if(rand.checked(scan) == false)
		{
			System.out.println("�ߺ��� �� �Է��� �ȵ˴ϴ�! �ٽ� �Է��� �ּ���!");
			return false;
		}
		return true;
	}

}
