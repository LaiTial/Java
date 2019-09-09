package number_baseball_game;

import java.util.Random;

public class rand {
	
	Random rand = new Random();
	int answer[] = new int[3];
	
	public rand()
	{
		while(true)
		{
			for(int i=0; i<3; i++)
				answer[i] = rand.nextInt(10);
			
			if(checked(answer))
				break;
		}
	}
	
	public int[] getAnswer() {
		return answer;
	}

	public static boolean checked(int temp[])
	{
		if((temp[0] != temp[1]) && (temp[0] != temp[2]) && (temp[1] != temp[2]))
			return true;
		
		else
			return false;		
	}
	
}