import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Background1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Background1 extends World
{

    /**
     * Constructor for objects of class Background1.
     * 
     */
    public Background1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        Pokemon squirtle = new Pokemon(50, 50, "Squirtle", "scratch", "Water");
        Pokemon charmander = new Pokemon(50, 50, "Charmander", "scratch", "Fire");

        addObject(squirtle, 150, 200);
        addObject(charmander, 450, 200);
    }
}