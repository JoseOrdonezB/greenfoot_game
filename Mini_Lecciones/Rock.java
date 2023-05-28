import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rock extends Actor
{
    /**
     * Act - do whatever the Rock wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        movement();
        destroy();
    }
    
    public void movement()
    {
        move(3);
        if (Greenfoot.getRandomNumber(10)<1)
        {
            turn(Greenfoot.getRandomNumber(90)-45);
        }
        else if(isAtEdge())
        {
            turn(15);
        }
    }
    
    public void destroy()
    {
        Actor rocket = getOneIntersectingObject(Rocket.class);
        World w = getWorld();
        if (rocket != null)
        {
            w.removeObject(rocket);
            w.removeObject(this);
            Greenfoot.playSound("nave.wav");
        }
    }
}
