import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bomb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bomb extends Obstacle
{
    /**
     * Act - do whatever the Bomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   
    private float yVelocity;
    private final float GRAVITY;
    
    public Bomb(float gravity)
    {
        GRAVITY = gravity;
    }

    public void act()
    {

    }

    protected void fall()
    { 
    // Causes the object to fall onto a platform below protected void fall()
    if(!isOnGround())
        {
            yVelocity += GRAVITY;
            setLocation(getX(), getY() + (int) yVelocity);
        }
    }
}
