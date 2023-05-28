import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends Actor
{
    boolean canFire = true;
    /**
     * Act - do whatever the Rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.isKeyDown("Down"))
        {
            setRotation(90);
            move(3);
        }
        if (Greenfoot.isKeyDown("Up"))
        {
            setRotation(270);
            move(3);
        }
        if (Greenfoot.isKeyDown("Right"))
        {
            setRotation(0);
            move(3);
        }
        if (Greenfoot.isKeyDown("Left"))
        {
            setRotation(180);
            move(3);
        }
        shoot();
    }
    
    public void shoot()
    {
        World w = getWorld();
        if(Greenfoot.isKeyDown("Space") && canFire == true)
        {
           w.addObject(new Laser(), getX()-50 , getY()); 
           canFire = false;
        }
        else if (!Greenfoot.isKeyDown("Space"))
        {
            canFire = true;
        }
    }
}
