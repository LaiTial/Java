package game;

import java.util.Random;

public class workpench {
	
	void pan(char s[][])
	{
		System.out.println("  " + s[0][0] + "|  " + s[0][1] + "|  "
				+ ""
				+ ""
				+ ""
				+ ""  + s[0][2]);
		System.out.println("---|---|---");
		System.out.println("  " + s[1][0] + "|  " + s[1][1] + "|  "  + s[1][2]);
		System.out.println("---|---|---");
		System.out.println("  "  + s[2][0] + "|  " + s[2][1] + "|  "  + s[2][2]);
	}
	
	int check_ar(char s[][])
	{
		for(int i=0; i<s.length; i++)
		{
			for(int j=0; j<s[0].length; j++)
			{
				if(s[i][j] == '\0')
				{
					return 0;
				}
			}
		}
		
		return 1;
	}
	
	void make_make(char s[][])
	{
		int x, y;
		
		Random tt = new Random();
		
		while(true)
		{
			x = tt.nextInt(3);
			y = tt.nextInt(3);
			
			if(s[x][y] == '\0')
			{
				s[x][y] = 'O';
				return;
			}
		
		}
	}
}
