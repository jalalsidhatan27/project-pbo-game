import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LayarAwal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LayarAwal extends World
{

    public LayarAwal()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1);
        
        prepare();
    }
    
    private void prepare()
    {

        start start = new start();
        addObject(start,92,44);
        caramain caramain = new caramain();
        addObject(caramain,111,124);
        start.setLocation(123,41);
        caramain.setLocation(113,122);
        caramain.setLocation(140,111);
        start.setLocation(132,23);
        removeObject(caramain);
        start.setLocation(111,68);
        start.setLocation(130,72);
        caramain caramain2 = new caramain();
        addObject(caramain2,81,137);
        caramain2.setLocation(139,139);
        start.setLocation(128,40);
        caramain2.setLocation(73,106);
        caramain2.setLocation(211,106);
        caramain2.setLocation(142,131);
        start.setLocation(126,49);
        caramain2.setLocation(127,108);
        start.setLocation(128,43);
        caramain2.setLocation(136,102);
        caramain2.setLocation(120,107);
        caramain2.setLocation(106,127);
        start.setLocation(106,51);
    }
}

