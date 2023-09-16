import greenfoot.*;
public class Boss extends Actor{
    int moveCounter = 0;
    int alienCharge = Greenfoot.getRandomNumber(50);
    GreenfootImage alienLVL1 = new GreenfootImage("AlienStill.png");
    GreenfootImage alienLVL2 = new GreenfootImage("AlienLVL2.png");
    GreenfootImage alienLVL3 = new GreenfootImage("AlienLVL3Still.png");
    
    int Y_MOVE = 5;
    public Boss(){
        GreenfootImage alien = getImage();
        int alienHeight = (int)alien.getHeight()*7;
        int alienWidth = (int)alien.getWidth()*7;
        alien.scale(alienWidth,alienHeight);
        
        alienLVL1.scale(alienWidth,alienHeight);
        alienLVL2.scale(alienWidth,alienHeight);
        alienLVL3.scale(alienWidth,alienHeight);
    }
    public void act(){
        if(alienCharge <= 50){
            alienCharge++;
        }
        setLocation(getX(),getY()+ Y_MOVE);
        if(getY() > 550 || (getY() < 130)){
            Y_MOVE = Y_MOVE * -1;
        }
        
        if(alienCharge == 50){
            for(int degree = -20; degree <= +20; degree +=4){
                getWorld().addObject(new AlienBossLaser(getRotation()+degree), getX(),getY());
            }
            alienCharge = 0;
        }
        PlayerLaser playerLaser = (PlayerLaser) getOneIntersectingObject(PlayerLaser.class);
        
        if(isTouching(PlayerLaser.class)){
            BossLivesDisplay.alienBossLives--;
            getWorld().removeObject(playerLaser);
        }
        if(BossLivesDisplay.alienBossLives == 0){
            getWorld().removeObject(this);
        }
        
        
    }
    
}
