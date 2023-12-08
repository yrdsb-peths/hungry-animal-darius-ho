import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The world the hero lives in
 * 
 * @author Darius 
 * @version December 4 2023
 */
public class MyWorld extends World
{
    public int score = 0;
    Label scoreLabel;
    int level = 1;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        
        // Create the elephant object
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 300);
        
        // Create a label
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
        
        createApple();
        createCherries();
    }
    
    /**
     * End the game and draw "GameOver"
     */
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game over", 100);
        addObject(gameOverLabel, 300, 200);
    }
    
    /**
     * Increase the score everytime you eat an apple
     */
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
        
        if(score % 5 == 0)
        {
            level += 1;
        }
    }
    
    /**
     * Creates a new apple at a random location at the top of the screen*
     */
    public void createApple()
    {
        Apple apple = new Apple();
        apple.setSpeed(level);
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(apple, x ,y);
    }
    
     /**
     * Creates a new cherry at a random location at the top of the screen*
     */
    public void createCherries()
    {
        Cherries cherries = new Cherries();
        cherries.setSpeed(level);
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(cherries, x ,y);
    }
}
