import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Food for our elephant
 * 
 * @author Darius 
 * @version December 4 2023
 */
public class Apple extends Actor
{
    int speed = 1;
    
    public void act()
    {
        int x = getX();
        int y = getY() + speed;
        setLocation(x,y);
        
        // Remove apple and draw game over if the apple hits the bottom
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
