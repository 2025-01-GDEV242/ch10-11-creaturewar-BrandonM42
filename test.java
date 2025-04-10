
/**
 * Write a description of class test here.
 *
 * @author Brandon Magistrado
 * @version (a version number or a date)
 */


//this class is meant to test if things work, Im too lazy to delete it





















public class test
{
    // instance variables - replace the example below with your own
    private int x;
    Human bob = new Human();
    Elf ebob = new Elf();
    Balrog bbob = new Balrog();
    CyberDemon cbob = new CyberDemon();

    /**
     * Constructor for objects of class test
     */
    public test()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
    
    public void test()
    {
        System.out.println(bob.getHealth());
    }
    
    public void testDamage(int num)
    {
        bob.takeDamage(num);
    }
    
    public void testRandom(int num)
    {
        System.out.println(Randomizer.nextInt(num));
    }
    
    public void testDamage2()
    {
        for(int x = 0; x < 20; x++)
        {
        System.out.println(ebob.attack());
        System.out.println("h" + ebob.getHealth());
        System.out.println("d" + ebob.getStrength());
        }
    }
    
    public void testDamage3()
    {
        for(int x = 0; x < 10; x++)
        {
        System.out.println("health: " + bbob.getHealth());
        System.out.println("damage: " + bbob.getStrength());
        System.out.println("damage dealt: " + bbob.attack());
        System.out.println();
        }
    }
    
    public void testDamage4()
    {
        for(int x = 0; x < 10; x++)
        {
        System.out.println("health: " + cbob.getHealth());
        System.out.println("damage: " + cbob.getStrength());
        System.out.println("damage dealt: " + cbob.attack());
        System.out.println();
        }
    }
}
