import greenfoot.*;
public class AlienBossLaser extends Actor{
    int lifeSpan = 160;
    public AlienBossLaser(int rotation){
        GreenfootImage alienBossLaser = getImage();
        int alienLaserHeight = (int)alienBossLaser.getHeight()*2;
        int alienLaserWidth = (int)alienBossLaser.getWidth()*2;
        alienBossLaser.scale(alienLaserWidth,alienLaserHeight);
        setRotation(rotation);
    }
    
    public void act(){
        lifeSpan--;
        SpaceShip spaceShip = (SpaceShip) getOneIntersectingObject(SpaceShip.class);
        if(lifeSpan == 0 || isTouching(SpaceShip.class)){
            getWorld().removeObject(this);
        }
        move(-6);
        
    }
}
