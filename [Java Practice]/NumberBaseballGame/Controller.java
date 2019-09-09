package number_baseball_game;

public class Controller {

	parse_game game;
	get_scan sc;
	rand rd;
	print_baseball pprint;
	private int tries = 0;
	
	public Controller()
	{
		print_baseball.print_comment();
		rd = new rand();
		pprint = new print_baseball();
		
		do
		{	
			sc = new get_scan();
			
			tries++;
			
			if(sc.ScanCheck() == false)
				continue;
			
			game = new parse_game(rd.getAnswer(), sc.getScan());
			pprint.print_st_ball(game);
				
		}while(game.getStrike() != 3);
		
		pprint.print_tries(tries);
	}

}
