import greenfoot.*;
public class AlienLaser extends Actor{
    
    public AlienLaser(){
        GreenfootImage alienLaser = getImage();
        int alienLaserHeight = (int)alienLaser.getHeight()*2;
        int alienLaserWidth = (int)alienLaser.getWidth()*2;
        alienLaser.scale(alienLaserWidth,alienLaserHeight);
    }
    
    public void act(){
        if(getX() == 50){
            getWorld().removeObject(this);
        }
        
        move(-10);
        
    }
}
