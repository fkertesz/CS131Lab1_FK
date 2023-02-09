import java.util.Random;

/**
 * This is our NonPlayer Character that inherits
 * from GameCharacter it represent objects the game controls 
 * (as opposed to objects a human player controls).
 * @author Rob Kelley, Fanni Kertesz 
 * @version 1.4
 * Lab1
 * CS131
 */

public class NonPlayerCharacter extends GameCharacter
{
	//private visibility to protect from other classes
	private boolean active; //activity status of npc
	private String intelligenceType; //intelligence type of npc
	
	/**
	 *  The empty argument constructor calls the super class constructor
	 *  and sets activity status to false and intelligence type to average
	 */
	public NonPlayerCharacter()
	{
		super();
		active = false;
		intelligenceType = "AVERAGE";
	}//end empty constructor
	
	
	/**
	 * This constructor allows the caller to pass in
	 * the uniqueID, personality, activity status
	 * and intelligence type for the object.
	 * 
	 * @param id
	 * @param personality
	 * @param active
	 * @param inteligenceType
	 */
	public NonPlayerCharacter(String id, String personality, boolean active, String intelligenceType)
	{
		super(id, personality);
		this.active = active;
		this.intelligenceType = intelligenceType;
	}//end preferred constructor
	
	
	/*
	 * Getter for activity status
	 * @return active
	 */
	public boolean getActive()
	{
		return active;
	}//end getActive
	
	
	/*
	 * Setter for activity status
	 * @param newActive activity status set
	 */
	public void setActive(boolean newActive)
	{
		active = newActive;
	}//end setActive

	/*
	 * Getter for intelligence type
	 * @return intelligenceType
	 */
	public String getIntelligenceType()
	{
		return intelligenceType;
	}//end getIntelligenceType
	
	/*
	 * Setter for intelligence type
	 * @param newIT intelligence type set
	 */
	public void setIntelligenceType(String newIT)
	{
		intelligenceType = newIT;
	}//end setIntelligenceType
	
	
	/*
	 * Returns the structure of the object in a specially
	 * formatted representation. This is the preferred
	 * method for printing out the object structure.
	 * @return
	 */
	public String reportStructure()
	{	
		StringBuilder sB = new StringBuilder("\n");
		sB.append("Active: "+getActive()+"\n");
		sB.append("Intelligence: "+getIntelligenceType()+"\n");
		sB.append("==================================\n");
		return (super.reportStructure()+sB);
	}//end reportStructure
	
	/*
	 * Returns an introduction of the object
	 * with uniqueID as name
	 * @return
	 */
	public String introduce()
	{
		return ("Hello, my name is " + super.getUniqueID());
	}//end introduce
	
	
	/*
	 * Returns a random exclamation
	 * @return
	 */
	public String exclaim()
	{
		String [] s = new String [5];
		s[0] = "Dag Gummit";
		s[1] = "Doggone it";
		s[2] = "Holy cow";
		s[3] = "Jeez";
		s[4] = "Well cheese and crackers";
		Random r = new Random();
		return (s[(int)r.nextInt(6)]);
	}//end exclaim
}//end class
