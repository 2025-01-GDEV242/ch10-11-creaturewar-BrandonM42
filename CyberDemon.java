

/**
 * The CyberDemon class implements a wrapper for the base Creature class with the following additions
 * Implements a maximum/minimum strength for the creature type [20/5]
 * Implements a maximum/minimum hitpoint total for the creature type [25/5]
 * 
 * @author Brandon Magistrado
 * @version 2025-04 v1.1
 */
public class CyberDemon extends Demon
{
    // instance variables - replace the example below with your own
    private static final int MAX_CYBERDEMON_HP = 100;
    private static final int MIN_CYBERDEMON_HP = 25;
    private static final int MAX_CYBERDEMON_STR = 40;
    private static final int MIN_CYBERDEMON_STR = 20;

    /**
     * Constructor for objects of class CyberDemon -
     * Note that the calling class does not need to know anything about the 
     * requirements of human minimum and maximum values
     * 
     * The instantiating class asks for a CyberDemon and the human class is responsible for
     * return a CyberDemon object with values in the appropriate range
     * 
     */
    public CyberDemon()
    {
        // note how the class uses the static randomizer class to
        // generate the values. This localizes the need to know 
        // max and min values to this class only
        // max-min is range of values
        // range + min ensures that the values don't start at one.
        super
        (
            Randomizer.nextInt(MAX_CYBERDEMON_STR-MIN_CYBERDEMON_STR)+MIN_CYBERDEMON_STR,
            Randomizer.nextInt(MAX_CYBERDEMON_HP-MIN_CYBERDEMON_HP)+MIN_CYBERDEMON_HP        
        );
    }
    
    /**
     * gives the name string for the creature
     * @return returns creature which is the creature name string for a creature
     */
    public String whatCreature()
    {
        String creature = "CyberDemon";
        return creature;
    }
    
    // attack() - not overridden because Humans generate basic damage
    

}
