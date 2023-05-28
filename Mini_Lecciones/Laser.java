import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Laser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Laser extends Actor
{
    /**
     * Act - do whatever the Laser wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(-5);
        World w = getWorld();
        remove();
    }
    
    public void remove()
    {
        Actor rock = getOneIntersectingObject(Rock.class);
        World w = getWorld();
        if (rock != null)
        {
            w.removeObject(rock);
            w.removeObject(this);
            Greenfoot.playSound("laser.wav");
        }
        else if(isAtEdge())
        {
            w.removeObject(this);
        }
    }
}
