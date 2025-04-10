

/**
 * The Balrog class implements a wrapper for the base Creature class with the following additions
 * Implements a maximum/minimum strength for the creature type [20/5]
 * Implements a maximum/minimum hitpoint total for the creature type [25/5]
 * 
 * @author Brandon Magistrado
 * @version 2025-04 v1.1
 */
public class Balrog extends Demon
{
    // instance variables - replace the example below with your own
    private static final int MAX_BALROG_HP = 200;
    private static final int MIN_BALROG_HP = 80;
    private static final int MAX_BALROG_STR = 100;
    private static final int MIN_BALROG_STR = 50;

    /**
     * Constructor for objects of class Balrog -
     * Note that the calling class does not need to know anything about the 
     * requirements of human minimum and maximum values
     * 
     * The instantiating class asks for a Balrog and the human class is responsible for
     * return a Balrog object with values in the appropriate range
     * 
     */
    public Balrog()
    {
        // note how the class uses the static randomizer class to
        // generate the values. This localizes the need to know 
        // max and min values to this class only
        // max-min is range of values
        // range + min ensures that the values don't start at one.
        super
        (
            Randomizer.nextInt(MAX_BALROG_STR-MIN_BALROG_STR)+MIN_BALROG_STR,
            Randomizer.nextInt(MAX_BALROG_HP-MIN_BALROG_HP)+MIN_BALROG_HP        
        );
        /*
        Randomizer.nextInt((MAX_BALROG_STR-MIN_BALROG_STR)+MIN_BALROG_STR);
        Randomizer.nextInt((MAX_BALROG_HP-MIN_BALROG_HP)+MIN_BALROG_HP);
        */
          
    }
    
    /**
     * Stores totalDamage which takes in two super.attack() calls because balrogs attack twice
     * @return totalDamage which is the result of two super.attack() calls
     */
    public int attack()
    {
        int totalDamage = 0;
        totalDamage += super.attack();
        totalDamage += super.attack();
        return totalDamage;
    }
    
    /**
     * gives the name string for the creature
     * @return returns creature which is the creature name string for a creature
     */
    public String whatCreature()
    {
        String creature = "Balrog";
        return creature;
    }

}
