/*
 * This is the Application object that will launch our application
 * @author Rob Kelley, Fanni Kertesz
 * @version 1.4
 * Lab1 
 * CS131
 */
public class Application {

	public static void main(String[] args) {
		
		NonPlayerCharacter npc = new NonPlayerCharacter(); //new NonPlayerCharacter object
		
		//prints out structure of npc on system output
		System.out.println(npc.reportStructure());
		
		//prints out introduction from npc on system output
		System.out.println(npc.introduce());
		
		//prints out exclamation by npc on system output
		System.out.println(npc.exclaim());

	}//end main

}//end class