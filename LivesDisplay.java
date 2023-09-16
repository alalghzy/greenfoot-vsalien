import greenfoot.*;
import java.util.*;
public class LivesDisplay extends Actor{
    public static int lives = 15;
    Color fore = new Color(0,0,255,255);
    Color back = new Color(0,0,0,0);
    public LivesDisplay(){
        GreenfootImage image = new GreenfootImage("Lives: " + lives, 52, fore, back);
        setImage(image);
        
    }

    public void act(){
        
        GreenfootImage image = new GreenfootImage("Lives: " + lives, 52, fore, back);
        setImage(image);
        
    }
}
