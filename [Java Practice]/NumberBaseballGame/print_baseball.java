package number_baseball_game;

public class print_baseball {
	
	public static void print_comment()
	{
		System.out.println("[Number Baseball]");
		System.out.println("------------------");
		System.out.println("Guess 3 Numbers.");
	}
	
	public void print_st_ball(parse_game game)
	{
		
		if(game.getStrike() == 3)
		{
			System.out.println(game.getStrike() + " strike");
		}
		
		else
			System.out.println(game.getStrike() + " strike, " + game.getBall() + " ball");
	}
	
	public void print_tries(int tries)
	{
		System.out.println("\nYou make it on " + tries + " tries!");
	}

}
