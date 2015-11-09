class GuessGame
{
	//instances of player class.
	Player p1;
	Player p2;
	Player p3;
	
	void startGame()
	{
		//creates three new player instances.
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();
		
		//int values containing guess amount for each player.
		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0;
		
		//bools that state if player is right or not.
		boolean p1isright = false;
		boolean p2isright = false;
		boolean p3isright = false;
		
		//creates number for players to guess.
		int targetnumber = (int) (Math.random() * 10);//generates random int value: "(int)" between 1 and 9: "(Math.random() * 10)"
		System.out.println("im thinking of a number between 1 and 9.");
		
		while(true)//loop will always run.
		{
			System.out.println("guessed number is:" + targetnumber);
			
			//call players guess methods.
			p1.guess();
			p2.guess();
			p3.guess();
			
			//gets the result of each players guess from the guess function;
			guessp1 = p1.number;
			System.out.println("player one guessed: " + guessp1);
			
			guessp2 = p2.number;
			System.out.println("player three guessed: " + guessp2);
			
			guessp3 = p3.number;
			System.out.println("player three guessed: " + guessp3);
			
			//checks each player guess with target number, if the same trigger the corresponding "isright" bool.			
			if(guessp1 == targetnumber)
			{
				p1isright = true;
			}
			if(guessp2 == targetnumber)
			{
				p2isright = true;
			}
			if(guessp3 == targetnumber)
			{
				p3isright = true;
			}
			
			//if either player is correct, displays who won.
			if(p1isright || p2isright || p3isright)
			{
				System.out.println("winner found");
				System.out.println("player 1 right?: " + p1isright);
				System.out.println("player 2 right?: " + p2isright);
				System.out.println("player 3 right?: " + p3isright);				
				System.out.println("game over");
				break;				
			}
			else
			{
				System.out.println("players will guess again");
			}
		}
	}
}
class Player
{
	int number = 0;
	
	void guess()
	{
		number = (int) (Math.random() * 10);
		System.out.println("i'm guessing number, " + number);
	}
}
class GameLauncher
{
	public static void main(String [] args)
	{
		GuessGame game = new GuessGame();
		game.startGame();			
	}
}