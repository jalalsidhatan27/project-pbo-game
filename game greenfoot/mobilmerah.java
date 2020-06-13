import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mobilmerah here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mobilmerah extends parent
{
    int speed = 5;
    public void act() 
    {
       mobilmerah a = new mobilmerah();
        Actor i = getOneIntersectingObject(mobilbiru.class);
        move(speed);
        checkdouble(i);
        end();
    }    
}
