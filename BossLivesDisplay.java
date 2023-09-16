import greenfoot.*;
import java.util.*;
public class BossLivesDisplay extends Actor{
    public static int alienBossLives = 35;
    Color fore = new Color(0,0,255,255);
    Color back = new Color(0,0,0,0);
    public BossLivesDisplay(){
        GreenfootImage image = new GreenfootImage("Boss Lives: " + alienBossLives, 52, fore, back);
        setImage(image);
        
    }

    public void act(){
        
        GreenfootImage image = new GreenfootImage("Boss Lives: " + alienBossLives, 52, fore, back);
        setImage(image);
        
    }
}
