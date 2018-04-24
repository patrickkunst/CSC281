package hw5;

// Patrick Kunst
// Worked by myself

public class SoccerGame 
{
	
	private String team1, team2;
	private int team1Score, team2Score;
	
	private final int MIN_SCORE = 0;
	
	private static int totalGames = 0;
	private static int totalScore = 0;
	
	public SoccerGame() 
	{
		team1 = "Blaine";
		team2 = "Hamilton";
		team1Score = MIN_SCORE;
		team2Score = MIN_SCORE;
		totalGames += 1;
		totalScore += team1Score + team2Score;
	}
	
	public SoccerGame(String t1, String t2) 
	{
		team1 = t1;
		team2 = t2;
		team1Score = MIN_SCORE;
		team2Score = MIN_SCORE;
		totalGames += 1;
		totalScore += team1Score + team2Score;
	}
	
	public String getTeam1() 
	{
		return team1;
	}
	
	public String getTeam2() 
	{
		return team2;
	}
	
	public boolean incrScore(String team) 
	{
		if (team.equals(team1))
		{
			team1Score += 1;
			totalScore += 1;
			return true;
		}
		else if (team.equals(team2))
		{
			team2Score += 1;
			totalScore += 1;
			return true;
		}
		
		return false;
	}
	
	public void display() 
	{
		System.out.println("The current score is " + team1 + ": " + team1Score + ", " + team2 + ": " + team2Score);
	}
	
	public static double getAvg()
	{
		System.out.println(totalScore);
		System.out.println(totalGames);
		if ((totalGames == 0) || (totalScore == 0))
		{
			return 0.0;
		}
		
		return ((double)totalScore / (double)totalGames);
	}
	
}