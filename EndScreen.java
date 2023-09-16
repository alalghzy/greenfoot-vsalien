import greenfoot.*;
public class EndScreen extends World{
    public EndScreen(){
        super(1000, 700, 1); 
    }
    public void act(){
        if(Greenfoot.isKeyDown("R")){
            Greenfoot.setWorld(new StartScreen());
        }
    }
}
