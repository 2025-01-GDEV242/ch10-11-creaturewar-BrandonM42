

/**
 * The Demon class implements a wrapper for the base Creature class with the following additions
 * Implements a maximum/minimum strength for the creature type [20/5]
 * Implements a maximum/minimum hitpoint total for the creature type [25/5]
 * 
 * @author Brandon Magistrado
 * @version 2025-04 v1.1
 */
public class Demon extends Creature
{
    /**
     * Constructor for objects of class Demon -
     * Note that the calling class does not need to know anything about the 
     * requirements of human minimum and maximum values
     * 
     * The instantiating class asks for a Demon and the human class is responsible for
     * return a Demon object with values in the appropriate range
     * 
     */
    public Demon(int str, int hp)
    {
        // note how the class uses the static randomizer class to
        // generate the values. This localizes the need to know 
        // max and min values to this class only
        // max-min is range of values
        // range + min ensures that the values don't start at one.
       super(str,hp);
        
        
        
          
    }
    
    /**
     * Allows a creature to determine how much damage it is causing in this round of battle
     * @return +50 damage if the 1 out of 20 or 5% chance hits
     * @return a value between 1 and str to be used to cause damage to another creature
     */
    public int attack()
    {
        int magicalDamage = Randomizer.nextInt(20);
        
        if(magicalDamage == 1)
        {
            System.out.println("Demon did a Demonic Hit!");
            return super.attack() + 50;
        }
        else return super.attack();
    }

}
