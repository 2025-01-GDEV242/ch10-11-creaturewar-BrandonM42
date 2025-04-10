

/**
 * The Elf class implements a wrapper for the base Creature class with the following additions
 * Implements a maximum/minimum strength for the creature type [20/5]
 * Implements a maximum/minimum hitpoint total for the creature type [25/5]
 * 
 * @author Brandon Magistrado
 * @version 2025-04 v1.1
 */
public class Elf extends Creature
{
    // instance variables - replace the example below with your own
    private static final int MAX_ELF_HP = 25;
    private static final int MIN_ELF_HP = 8;
    private static final int MAX_ELF_STR = 18;
    private static final int MIN_ELF_STR = 5;

    /**
     * Constructor for objects of class Elf -
     * Note that the calling class does not need to know anything about the 
     * requirements of human minimum and maximum values
     * 
     * The instantiating class asks for a Elf and the human class is responsible for
     * return a Elf object with values in the appropriate range
     * 
     */
    public Elf()
    {
        // note how the class uses the static randomizer class to
        // generate the values. This localizes the need to know 
        // max and min values to this class only
        // max-min is range of values
        // range + min ensures that the values don't start at one.
        super(
            Randomizer.nextInt(MAX_ELF_STR-MIN_ELF_STR)+MIN_ELF_STR,
            Randomizer.nextInt(MAX_ELF_HP-MIN_ELF_HP)+MIN_ELF_HP        
        );
          
    }
    
    /**
     * Allows a creature to determine how much damage it is causing in this round of battle
     * @return 2x damage if the 1 out of 10 or 10% chance hits
     * @return a value between 1 and str to be used to cause damage to another creature
     */
    public int attack()
    {
        int magicalDamage = Randomizer.nextInt(10);
        
        if(magicalDamage == 1)
        {
            System.out.println("Elf did a Critical Hit!");
            return super.attack() * 2;
        }
        else return super.attack();
    }
    
    /**
     * gives the name string for the creature
     * @return returns creature which is the creature name string for a creature
     */
    public String whatCreature()
    {
        String creature = "Elf";
        return creature;
    }
    
}
