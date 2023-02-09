/*
 * This is the abstract SportsTeam class which is the parent
 * class of the BasketballTeam class
 * @author Fanni Kertesz
 * @version 1.0
 * Lab1 
 * CS131
 */
public abstract class SportsTeam
{
	protected String teamName; //this variable stores the team name
	protected String teamMascot; //this variable stores the team mascot
	protected String headCoach; //this variable stores the head coach
	protected int wins; //this variable stores the number of wins
	protected int losses; //this variable stores the number of losses
	
	/*
	 * empty-argument constructor initializes the instance variables
	 */
	public SportsTeam()
	{
		teamName = "";
		teamMascot = "";
		headCoach = "";
		wins = 0;
		losses = 0;
	}//end constructor
	
	/*
	 * @param preferred team name, team mascot, and head coach
	 */
	public SportsTeam(String teamName, String teamMascot, String headCoach)
	{
		this.teamName = teamName;
		this.teamMascot = teamMascot;
		this.headCoach = headCoach;
		wins = 0;
		losses = 0;
	}//end constructor
	
	/*
	 * @param new team name to be set
	 */
	public void setTeamName(String teamName)
	{
		this.teamName = teamName;
	}//end setTeamName
	
	/*
	 * @param new team mascot to be set
	 */
	public void setTeamMascot(String teamMascot)
	{
		this.teamMascot = teamMascot;
	}//end setTeamMascot
	
	/*
	 * @param new head coach to be set
	 */
	public void setHeadCoach(String headCoach)
	{
		this.headCoach = headCoach;
	}//end setHeadCoach
	
	/*
	 * @param new number of wins to be set
	 */
	public void setWins(int wins)
	{
		this.wins = wins;
	}//end setWins
	
	/*
	 * @param new number of losses to be set
	 */
	public void setLosses(int losses)
	{
		this.losses = losses;
	}//end setLosses
	
	/*
	 * @return team name
	 */
	public String getTeamName()
	{
		return teamName;
	}//end getTeamName
	
	/*
	 * @return team mascot
	 */
	public String getTeamMascot()
	{
		return teamMascot;
	}//end getTeamMascot
	
	/*
	 * @return head coach
	 */
	public String getHeadCoach()
	{
		return headCoach;
	}//end getHeadCoach
	
	/*
	 * @return number of wins
	 */
	public int getWins()
	{
		return wins;
	}//end getWins
	
	/*
	 * @return number of losses
	 */
	public int getLosses()
	{
		return losses;
	}//end getLosses
	
	/*
	 * @return percent of wins from all games
	 */
	public double getWinPercentage()
	{
		return (double)wins/(double)(wins+losses);
	}//end getWinPercentage
	
	/*
	 * abstract method instantiation for child class
	 * @return array of statistics
	 */
	public abstract double[] getStats();
	
}//end class
