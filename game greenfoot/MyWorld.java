import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        mobilbiru mobilbiru = new mobilbiru();
        addObject(mobilbiru,277,549);
        mobilbiru.setLocation(309,557);
        mobilbiru.setLocation(299,557);
    }
    
    public void act(){
        if(Greenfoot.getRandomNumber(200)<1){
            addObject(new mobilhijau(), Greenfoot.getRandomNumber(200) + 200, 0);
        }
        if(Greenfoot.getRandomNumber(500)<1){
            addObject(new mobilmerah(), Greenfoot.getRandomNumber(200) + 200, 0);
        }
        if(Greenfoot.getRandomNumber(40)<2){
            addObject(new pohon(), Greenfoot.getRandomNumber(150), 0);
            addObject(new pohon(), Greenfoot.getRandomNumber(150) + 460, 0);
        }
        if(Greenfoot.getRandomNumber(400)<1){
            addObject(new coin(), Greenfoot.getRandomNumber(200) + 200, 0);
        }
    }
}
