import greenfoot.*;
public class SpecialPlayerLaser extends Actor{
    public SpecialPlayerLaser(int rotation){
        GreenfootImage playerLaser = getImage();
        int playerLaserHeight = (int)playerLaser.getHeight()*2;
        int playerLaserWidth = (int)playerLaser.getWidth()*2;
        playerLaser.scale(playerLaserWidth,playerLaserHeight);
        setRotation(rotation);
        turn(-90);
    }

    public void act(){
        if(getX() > 950){
            getWorld().removeObject(this);
        }
        
        move(10);
    }
}

