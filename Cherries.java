import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cherries here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cherries extends Actor
{
    /**
     * Act - do whatever the Cherries wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed = 1;
    
    public void act()
    {
        int x = getX();
        int y = getY() + speed;
        setLocation(x,y);
        
        // Remove cherry and draw game over if the cherry hits the bottom
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
        }
    }
    
    public void setSpeed(int spd)
    {
        speed = spd;
    }
}
