/*
 * This is the BasketballTeam class which is the child
 * class of the SportsTeam class
 * @author Fanni Kertesz
 * @version 1.0
 * Lab1 
 * CS131
 */
public class BasketballTeam extends SportsTeam
{
	private int fieldGoals;//this variable stores the number of successful field goals
	private int fieldGoalsAttempted;//this variable stores the number of attempted field goals
	private int freeThrows;//this variable stores the number of successful free throws
	private int freeThrowsAttempted;//this variable stores the number of attempted free throws
	
	/*
	 * empty-argument constructor to initialize the instance variables
	 */
	public BasketballTeam()
	{
		super();
		fieldGoals = 0;
		fieldGoalsAttempted = 0;
		freeThrows = 0;
		freeThrowsAttempted = 0;
	}//end constructor
	
	/*
	 * @param team name, team mascot, head coach
	 */
	public BasketballTeam(String teamName1, String teamMascot1, String headCoach1)
	{
		super(teamName1, teamMascot1, headCoach1);
		fieldGoals = 0;
		fieldGoalsAttempted = 0;
		freeThrows = 0;
		freeThrowsAttempted = 0;
	}//end constructor
	
	/*
	 * @param number of successful field goals to be set
	 */
	public void setFieldGoals(int fieldGoals)
	{
		this.fieldGoals = fieldGoals;
	}//end SetFieldGoals
	
	/*
	 * @param number of attempted field goals to be set
	 */
	public void setFieldGoalsAttempted(int fieldGoalsAttempted)
	{
		this.fieldGoalsAttempted = fieldGoalsAttempted;
	}//end setFieldGoalsAttempted
	
	/*
	 * @param number of successful free throws to be set
	 */
	public void setFreeThrows(int freeThrows)
	{
		this.freeThrows = freeThrows;
	}//end setFreeThrows
	
	/*
	 * @param number of attempted free throws to be set
	 */
	public void setFreeThrowsAttempted(int freeThrowsAttempted)
	{
		this.freeThrowsAttempted = freeThrowsAttempted;
	}//end setFreeThrowsAttempted
	
	/*
	 * @return number of successful field goals
	 */
	public int getFieldGoals()
	{
		return fieldGoals;
	}//end getFieldGoals
	
	/*
	 * @return number of attempted field goals
	 */
	public int getFieldGoalsAttempted()
	{
		return fieldGoalsAttempted;
	}//end getFieldGoalsAttempted
	
	/*
	 * @return number of successful free throws
	 */
	public int getFreeThrows()
	{
		return freeThrows;
	}//end getFreeThrows
	
	/*
	 * @return number of successful free throws
	 */
	public int getFreeThrowsAttempted()
	{
		return freeThrowsAttempted;
	}//end getFreeThrowsAttempted
	
	/*
	 * @return percentage of successful field goals from all attempted
	 */
	public double fieldGoalPercentage()
	{
		return (double) fieldGoals/ (double) fieldGoalsAttempted;
	}//end fieldGoalPercentage
	
	/*
	 * @return percentage of successful free throws from all attempted
	 */
	public double freeThrowPercentage()
	{
		return (double) freeThrows/ (double) freeThrowsAttempted;
	}//end freeThrowPercentage
	
	/*
	 * @param number of wins, losses, field goals, attempted field
	 * goals, free throws, attempted free throws to be set
	 */
	public void setStats(int wins, int losses, int fieldGoals, int fieldGoalsAttempted, int freeThrows, int freeThrowsAttempted)
	{
		this.wins=wins;
		this.losses = losses;
		this.fieldGoals = fieldGoals;
		this.fieldGoalsAttempted = fieldGoalsAttempted;
		this.freeThrows = freeThrows;
		this.freeThrowsAttempted = freeThrowsAttempted;
		
	}//end setStats
	
	/*
	 * @return an array of double type containing the win percentage,
	 * the field goal percentage, and the free throw percentage
	 */
	public double[] getStats()
	{
		double[] a = new double[3];
		a[0] = (double) this.getWinPercentage();
		a[1] = this.fieldGoalPercentage();
		a[2] = this.freeThrowPercentage();
		return a;
	}//end getStats
}//end class