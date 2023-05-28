import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spawner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spawner extends Actor
{
    /**
     * Act - do whatever the Spawner wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        spawn();
    }
    
    public void spawn()
    {
        World w = getWorld();
        if(Greenfoot.getRandomNumber(100) == 1)
        {
            w.addObject(new Rock(), 0, Greenfoot.getRandomNumber(w.getWidth()));
        }
    }
}
