import java.util.ArrayList;
/**
 * Write a description of class Battle here.
 *
 * @author Brandon Magistrado
 * @version (a version number or a date)
 */
public class Battle
{
    //both arrays for the armies
    private ArrayList<Creature>armyOne = new ArrayList<Creature>();
    private ArrayList<Creature>armyTwo = new ArrayList<Creature>();

    /**
     * Constructor for objects of class Battle
     */
    public Battle()
    {
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    
    /*1-4 = Human
     * 5-7 = Elf
     * 8-9 = CyberDemon
     * 10 = Balrog
     */
    
    /**
     * populates the two army arraylists creates a random number 1-10,
     * 1 - 4 for humans
     * 5 - 7 for elves
     * 8 - 9 for CyberDemons
     * 10 for Balrogs
     * 
     * goes through a for loop x times based on the amount of creatures per army input
     * adds a random creature based on the randomized number
     */
    public void populateArmy(int armySize)
    {
        int randomNumOne;
        int randomNumTwo;
        
        for(int x = 0; x < armySize; x++)
        {
            randomNumOne = Randomizer.nextInt(10);
            randomNumTwo = Randomizer.nextInt(10);
            
            //populate army one
            if(randomNumOne <=4)
            {
                armyOne.add(new Human());
            }
            else if(randomNumOne > 4 && randomNumOne <= 7)
            {
                armyOne.add(new Elf());
            }
            else if(randomNumOne > 7 && randomNumOne <= 9)
            {
                armyOne.add(new CyberDemon());
            }
            else if(randomNumOne == 10)
            {
                armyOne.add(new Balrog());
            }
            
            //populate army two
            if(randomNumTwo <=4)
            {
                armyTwo.add(new Human());
            }
            else if(randomNumTwo > 4 && randomNumTwo <= 7)
            {
                armyTwo.add(new Elf());
            }
            else if(randomNumTwo > 7 && randomNumTwo <= 9)
            {
                armyTwo.add(new CyberDemon());
            }
            else if(randomNumTwo == 10)
            {
                armyTwo.add(new Balrog());
            }
        }
    }
    
    /**
     * Starts the war between creatures only if the arraylist isnt empty between the two lists
     * detects if the army creature in index 0 is alive and prints out the creature info
     * does the methods for battling
     * if the health is less than or equal to 0 then the creature is dead
     * creature gets removed from array
     */
    public void startTheWar()
    {
        while(armyOne.size() != 0 && armyTwo.size() != 0)
        {
            if(armyOne.get(0).isAlive() && armyTwo.get(0).isAlive())
            {
                System.out.println(armyOne.get(0).whatCreature() + "  versus  " + armyTwo.get(0).whatCreature());
                System.out.println("Health: " + armyOne.get(0).getHealth() + "     "+ "            Health: " + armyTwo.get(0).getHealth());
                System.out.println("Max Possible Damage: " + armyOne.get(0).getStrength() + "     " + "Max Possible Damage: " + armyTwo.get(0).getStrength());
                System.out.println();
                
                armyTwo.get(0).takeDamage(armyOne.get(0).attack());
                armyOne.get(0).takeDamage(armyTwo.get(0).attack());
                
                if(armyOne.get(0).isKnockedOut())
                {
                    System.out.println(armyOne.get(0).whatCreature() + " Has died! \n");
                    armyOne.remove(0);
                }
                if(armyTwo.get(0).isKnockedOut())
                {
                    System.out.println(armyTwo.get(0).whatCreature() + " Has died! \n");
                    armyTwo.remove(0);
                }
            }
        }
        
        if(armyOne.size() == 0)
        {
            System.out.println("Army Two has won the war.");
        }
        
        if(armyTwo.size() == 0)
        {
            System.out.println("Army One has won the war.");
        }
    }
}
