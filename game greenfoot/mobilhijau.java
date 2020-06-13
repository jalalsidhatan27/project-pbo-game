import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mobilhijau here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mobilhijau extends parent
{
    int speed = 3;
    
    public void act() 
    {
        mobilhijau a = new mobilhijau();
        Actor i = getOneIntersectingObject(mobilhijau.class);
        move(speed);
        checkdouble(i);
        end();
    }    
}
