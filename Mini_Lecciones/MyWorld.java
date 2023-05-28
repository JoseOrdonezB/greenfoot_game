import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Rock rock = new Rock();
        addObject(rock,127,113);
        Rock rock2 = new Rock();
        addObject(rock2,196,333);
        Rock rock3 = new Rock();
        addObject(rock3,435,161);
        Rock rock4 = new Rock();
        addObject(rock4,466,344);
        rock4.setLocation(458,341);
        rock3.setLocation(485,107);
        rock4.setLocation(390,309);
        rock2.setLocation(129,326);
        rock.setLocation(95,164);
        rock.setLocation(293,164);
        rock.setLocation(231,196);
        rock.setLocation(284,181);
        rock.setLocation(250,67);
        rock2.setLocation(212,363);
        rock4.setLocation(329,235);
        Rock rock5 = new Rock();
        addObject(rock5,481,334);
        Rocket rocket = new Rocket();
        addObject(rocket,73,224);
        rocket.setLocation(73,234);
        rocket.setLocation(529,219);
        rock3.setLocation(89,182);
        rock.setLocation(137,50);
        rock4.setLocation(290,99);
        rock2.setLocation(138,341);
        rock5.setLocation(263,252);
        removeObject(rock2);
        removeObject(rock5);
        removeObject(rock3);
        removeObject(rock4);
        removeObject(rock);
        Spawner spawner = new Spawner();
        addObject(spawner,6,395);
        Rock rock6 = new Rock();
        addObject(rock6,77,82);
        Rock rock7 = new Rock();
        addObject(rock7,118,321);
        Rock rock8 = new Rock();
        addObject(rock8,221,204);
        Rock rock9 = new Rock();
        addObject(rock9,312,351);
        Rock rock10 = new Rock();
        addObject(rock10,268,70);
    }
}
