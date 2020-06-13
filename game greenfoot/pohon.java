import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pohon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pohon extends parent
{
    int speed = 3;
    public void act() 
    {
        pohon a = new pohon();
        Actor i = getOneIntersectingObject(pohon.class);
        move(speed);
        checkdouble(i);
        end();
    }    
}
