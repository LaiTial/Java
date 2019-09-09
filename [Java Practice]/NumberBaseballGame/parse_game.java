package number_baseball_game;

public class parse_game {
	
	private int strike = 0, ball = 0;
	
	public parse_game(int answer[], int scan[])
	{
		checkError(answer, scan);
	}
	
	public void checkError(int answer[], int scan[])
	{
		for(int i=0; i<3; i++)
		{
			if(answer[i] == scan[i])
				strike++;
		}
		
		for(int i=0; i<2; i++)
		{
			if(answer[i] == scan[i+1])
				ball++;
		}
		
		for(int i=2; i>0; i--)
		{
			if(answer[i] == scan[i-1])
				ball++;
		}
		
		if(answer[0] == scan[2])
			ball++;
		
		if(answer[2] == scan[0])
			ball++;
			
	}
	
	public int getStrike() {
		return strike;
	}

	public int getBall() {
		return ball;
	}

}
