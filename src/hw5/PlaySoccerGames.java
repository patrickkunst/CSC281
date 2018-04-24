package hw5;

public class PlaySoccerGames 
{

	public static void main(String[] args) 
	{
		
		System.out.println("The average score across all games is: " + SoccerGame.getAvg());
		System.out.println();
		
		System.out.println("Information for the first game: ");
		SoccerGame game1 = new SoccerGame();
		game1.display();
		System.out.println("The average score across all games is: " + SoccerGame.getAvg());
		if (game1.incrScore(game1.getTeam1()))
			System.out.println(game1.getTeam1() + " scored a goal.");
		else System.out.println(game1.getTeam1() + " did not score a goal.");
		game1.display();
		System.out.println("The average score across all games is: " + SoccerGame.getAvg());
		if (game1.incrScore(game1.getTeam2()))
			System.out.println(game1.getTeam2() + " scored a goal.");
		else System.out.println(game1.getTeam2() + " did not score a goal.");
		game1.display();
		System.out.println("The average score across all games is: " + SoccerGame.getAvg());
		if (game1.incrScore(game1.getTeam1()))
			System.out.println(game1.getTeam1() + " scored a goal.");
		else System.out.println(game1.getTeam1() + " did not score a goal.");
		game1.display();
		System.out.println("The average score across all games is: " + SoccerGame.getAvg());
		
		System.out.println();
		System.out.println("Information for the second game: ");
		SoccerGame game2 = new SoccerGame("Chicago Fire", "Columbus Crew");
		game2.display();
		System.out.println("The average score across all games is: " + SoccerGame.getAvg());
		if (game2.incrScore(game2.getTeam1()))
			System.out.println(game2.getTeam1() + " scored a goal.");
		else System.out.println(game2.getTeam1() + " did not score a goal.");
		game2.display();
		System.out.println("The average score across all games is: " + SoccerGame.getAvg());
		if (game2.incrScore(game2.getTeam1()))
			System.out.println(game2.getTeam1() + " scored a goal.");
		else System.out.println(game2.getTeam1() + " did not score a goal.");
		game2.display();
		System.out.println("The average score across all games is: " + SoccerGame.getAvg());
		if (game2.incrScore("Killer Prudence"))
			System.out.println("Killer Prudence scored a goal.");
		else System.out.println("Killer Prudence did not score a goal.");
		game2.display();
		System.out.println("The average score across all games is: " + SoccerGame.getAvg());
	}

}
