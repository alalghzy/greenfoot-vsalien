import greenfoot.*;
public class WinScreen extends World
{
    public WinScreen()
    {    

        super(1000,700, 1); 
        prepare();
    }

    public void act(){
        if(Greenfoot.isKeyDown("R")){
            Greenfoot.setWorld(new StartScreen());
        }
    }
    private void prepare()
    {
    }
}
