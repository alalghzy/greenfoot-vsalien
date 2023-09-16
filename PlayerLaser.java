import greenfoot.*;
public class PlayerLaser extends Actor{
    public PlayerLaser(){
        GreenfootImage playerLaser = getImage();
        int playerLaserHeight = (int)playerLaser.getHeight()*2;
        int playerLaserWidth = (int)playerLaser.getWidth()*2;
        playerLaser.scale(playerLaserWidth,playerLaserHeight);

    }

    public void act(){
        if(getX() > 950){
            getWorld().removeObject(this);
            Greenfoot.playSound("explosion.wav");
        }

        move(10);
    }
}

