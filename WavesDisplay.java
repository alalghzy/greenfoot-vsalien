import greenfoot.*;
import java.util.*;
public class WavesDisplay extends Actor{
    public static int wave = 1;
    String str1 = ("/5");
    Color fore = new Color(0,0,255,255);
    Color back = new Color(0,0,0,0);
    public WavesDisplay(){
        GreenfootImage image = new GreenfootImage("Wave: " + wave + str1, 52, fore, back);
        setImage(image);
        
    }

    public void act(){
        
        GreenfootImage image = new GreenfootImage("Wave: " + wave + str1, 52, fore, back);
        setImage(image);
        
    }
}
