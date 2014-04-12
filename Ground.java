import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ground here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ground extends Actor
{
    /**
     * Act - do whatever the Ground wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed = 0;
    
    public void act() 
    {
       move();
    }  
    
    public void move()
    {
       if ((speed < 0 && getX() == 0) || (speed > 0 && getX() == getWorld().getWidth()-1)) speed = -speed;
      move(speed);
    }
}
