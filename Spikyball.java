import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spikyball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spikyball extends Actor
{
    public int xSpeed = 4;
    public int ySpeed = 4;
    
    /**
     * Act - do whatever the Spikyball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();
        wallBounce();
        personBounce();
    }    
    
    
    public void move()
    {
        setLocation(getX() + xSpeed, getY()+ ySpeed);
        
        
    }  
    
    
    public void wallBounce()
    {
       if(getX() >= getWorld().getWidth() - getImage().getWidth()/2)
       {
           xSpeed = xSpeed * -1; 
       }
        
        
    }
    
    public void personBounce()
    {
        Actor person = getOneIntersectingObject(Person.class);
        
        if(person != null)
        {
            ySpeed = ySpeed * -1;
        }
    
    
    }
}
