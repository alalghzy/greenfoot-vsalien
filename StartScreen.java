import greenfoot.*;

public class StartScreen extends World
{
    public StartScreen()
    {    

        super(1000,700, 1); 
        prepare();
        GreenfootSound backgroundMusic = new GreenfootSound("bgsound.wav");
        backgroundMusic.playLoop();
    }

    public void act(){
        if(Greenfoot.isKeyDown("Enter")){
            Greenfoot.setWorld(new GameScreen());
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
