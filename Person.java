import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person extends Actor
{
    boolean touchingSpikyBall2 = false;
    boolean touchingSpikyBall3 = false;
    //boolean touchingSpikyBall2 = false;
    private int speed = 3; //running speed (sideways)
    private int vSpeed = 0;
    private int acceleration = 2;
    private Counter counter;
    public Person(Counter pointCounter)
    {
       counter = pointCounter;
    }
    
    /**
     * Act - do whatever the Person wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkKeys();
        checkFall();
        Collision();
  
    }    
private void checkKeys()
{
    if(Greenfoot.isKeyDown("left"))
    {
        moveLeft();
    }
    if(Greenfoot.isKeyDown("right"))
    {
        moveRight();
    } 
}

public boolean onGround()
{
   Actor under = getOneObjectAtOffset ( 0, 40, Ground.class);
    return under != null;
}

public void checkFall()
{
    if(onGround()) 
    {
       vSpeed = 0;
    }
    else {
        fall();
    }
}

public void Collision()
{
    Actor collision1 = getOneIntersectingObject(Spikyball2.class); 
    Actor collision2 = getOneIntersectingObject(Spikyball3.class);
    Actor collision3 = getOneIntersectingObject(Ghost.class);
    
    if(collision1 != null)//if you have not run into it 
    {
       World myWorld = getWorld();
       JavaBackground space = (JavaBackground)myWorld;
       HealthBar healthbar = space.getHealthBar();
       if(touchingSpikyBall2 == false)
       if(touchingSpikyBall3 == false)
       {
           healthbar.loseHealth();
           touchingSpikyBall2 = true;
           touchingSpikyBall3 = true;
           if(healthbar.health <=0)
           {
              myWorld.removeObject(this);
            }
        }
       counter.add(1);
       Greenfoot.playSound("hooray.wav");
    }else {
        touchingSpikyBall2 = false;
        touchingSpikyBall3 = false;
    
    if(collision2 != null)//if you have not run into it 
    {
       counter.add(1);
       Greenfoot.playSound("explosion.wav");
    }
    
    if(collision3 != null)//if you have not run into it 
    {
       counter.add(1);
       Greenfoot.playSound("fanfare.wav");
    }
    
}  
}

public void fall()
{
    setLocation ( getX(), getY() + vSpeed);
    vSpeed = vSpeed + acceleration;
}

public void moveRight()
{
    setLocation ( getX() + speed, getY() );
}

public void moveLeft()
{
    setLocation ( getX() - speed, getY() );
}

//public void tryToCollide()
//{
    //if (canSee(Person.class))
    //{
        //collide(Person.class);
        //Counter.add(5);
    //}
    //if (counter.getValue() >= 80){
        //gameOver();
    //}


//}
}





