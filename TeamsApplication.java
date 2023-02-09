/**
 * This is the Application class that will launch the BasketballTeam class
 * @author Fanni Kertesz
 * @version 1.0
 * Lab1 
 * CS131
 */
public class TeamsApplication
{
	public static void main(String[] args)
	{
		//new BasketballTeam object with preferred variables
		BasketballTeam a = new BasketballTeam("Name", "Mascot", "Coach");
		
		//new BasketballTeam object with default variables
		BasketballTeam b = new BasketballTeam();
		
		//testing the setter methods
		b.setTeamName("New Name");
		b.setTeamMascot("New Mascot");
		b.setHeadCoach("New Head Coach");
		a.setWins(2);
		a.setLosses(1);
		a.setFieldGoals(8);
		a.setFieldGoalsAttempted(10);
		a.setFreeThrows(7);
		a.setFreeThrowsAttempted(10);
		b.setStats(5, 3, 9, 9, 7, 8);
		
		//testing the getter methods on BasketballTeam 'a'
		System.out.println("BasketballTeam \"a\" info:");
		System.out.println("Team name: " + a.getTeamName());
		System.out.println("Team mascot: " + a.getTeamMascot());
		System.out.println("Head Coach: " + a.getHeadCoach());
		System.out.println("Wins: " + a.getWins() + "\t  Losses: " + a.getLosses());
		System.out.println("Free throw attempts: " + a.getFreeThrowsAttempted());
		System.out.println("Successful free throws: " + a.getFreeThrows());
		System.out.println("Field goal attempts: " + a.getFieldGoalsAttempted());
		System.out.println("Successful field goals: " + a.getFieldGoals());
		System.out.println("Wins percentage: " + a.getStats()[0]);
		System.out.println("Field goal percentage: " + a.getStats()[1]);
		System.out.println("Free throw percentage: " + a.getStats()[2]);
		
		System.out.println("\n-------------------------------------------\n");
		
		//testing the getter methods on BasketballTeam 'b'
		System.out.println("BasketballTeam \"b\" info:");
		System.out.println("Team name: " + b.getTeamName());
		System.out.println("Team mascot: " + b.getTeamMascot());
		System.out.println("Head Coach: " + b.getHeadCoach());
		System.out.println("Wins: " + b.getWins() + "\t  Losses: " + b.getLosses());
		System.out.println("Free throw attempts: " + b.getFreeThrowsAttempted());
		System.out.println("Successful free throws: " + b.getFreeThrows());
		System.out.println("Field goal attempts: " + b.getFieldGoalsAttempted());
		System.out.println("Successful field goals: " + b.getFieldGoals());
		System.out.println("Wins percentage: " + b.getStats()[0]);
		System.out.println("Field goal percentage: " + b.getStats()[1]);
		System.out.println("Free throw percentage: " + b.getStats()[2]);
	}//end main
}//end class
