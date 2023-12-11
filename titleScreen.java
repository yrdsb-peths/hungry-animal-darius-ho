import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title screen
 * 
 * @author Darius
 * @version December 5 2023
 */
public class titleScreen extends World
{
    Label titleLabel = new Label("The Elephant", 70);
    /**
     * Constructor for objects of class titleScreen.
     * 
     */
    public titleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, 225, 100);
        prepare();
    }

    /**
     * The main world act loop
     */
    public void act()
    {
        // Start the game if user presses the space bar
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Elephant elephant = new Elephant();
        addObject(elephant,496,92);

        Label label = new Label("Use A and D to Move", 40);
        addObject(label,300,242);
        Label label2 = new Label("Press <space> to Start", 40);
        addObject(label2,305,339);
        label2.setLocation(300,300);
    }
}
