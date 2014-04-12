import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sound here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sound extends Actor
{
    private int speed = 3; //running speed (sideways)
    private int vSpeed = 0;
    private int acceleration = 2;
    /**
     * Act - do whatever the Sound wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        playSound();
       
    }    
    
    public void playSound()
    {
	if (Greenfoot.isKeyDown("left"))
        {
        Greenfoot.playSound( "sound.wav" );
        }
    }

public boolean onGround()
{
   Actor under = getOneObjectAtOffset ( 0, 40, Ground.class);
    return under != null;
}

public void fall()
{
    setLocation ( getX(), getY() + vSpeed);
    vSpeed = vSpeed + acceleration;
}
}
