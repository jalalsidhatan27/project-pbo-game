import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class start extends Actor
{
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new MyWorld());
        }  
    }    
}
