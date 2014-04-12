import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class JavaBackground here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JavaBackground extends World
{
    HealthBar healthbar = new HealthBar();
    
    public HealthBar getHealthBar()
    {
        return healthbar;
    }
        
    /**
     * Constructor for objects of class JavaBackground.
     * 
     */
    
    private void prepare()
    {
        addObject(healthbar, 200, 40);
        Counter counter = new Counter();
        addObject(counter, 800, 30);
        Person person = new Person(counter);
        addObject(person, 35, 35);
        Ground ground1 = new Ground ();
        addObject(ground1, 150, 420);
        Ground ground2 = new Ground ();
        addObject(ground2, 400, 520);
        Ground ground3 = new Ground ();
        addObject(ground3, 680, 620);
        Spikyball2 spiky1 = new Spikyball2();
        addObject(spiky1, 250, 160);
        Spikyball3 spiky2 = new Spikyball3();
        addObject(spiky2, 800, 160);
        Ghost ghost = new Ghost();
        addObject(ghost, 400, 460);
        
    }
    
    
    public JavaBackground()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 900, 1); 
        prepare();
        
    }
}
