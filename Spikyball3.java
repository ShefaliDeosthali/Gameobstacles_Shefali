import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spikyball2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spikyball3 extends Actor
{
    private int vSpeed = 1;
    private int acceleration = 1;
    
    /**
     * Act - do whatever the Spikyball2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         checkFall();
         
    }
    
public boolean onGround()
{
   Actor under = getOneObjectAtOffset ( 0, 40, Ground.class);
    return under != null;
}

    public void checkFall()
{
   setLocation ( getX(), getY() + vSpeed);
   vSpeed = vSpeed + acceleration;
    if (onGround())
   {
       vSpeed=-vSpeed;
    }
  //  else 
 //   {
     
  //   if ((vSpeed < 0 && getY() == 0) || (vSpeed > 0 && getY() == getWorld().getHeight()-1)) 
   //  vSpeed = -vSpeed;
}
}


