import greenfoot.*;
public class AlienLVL3 extends Actor{
    int moveCounter = 0;
    int alienCharge = Greenfoot.getRandomNumber(70);
    GreenfootImage alienLVL1 = new GreenfootImage("AlienStill.png");
    GreenfootImage alienLVL2 = new GreenfootImage("AlienLVL2.png");
    int alienLives = 3;
    public AlienLVL3(){
        GreenfootImage alien = getImage();
        int alienHeight = (int)alien.getHeight()*4;
        int alienWidth = (int)alien.getWidth()*4;
        alien.scale(alienWidth,alienHeight);
        
        alienLVL1.scale(alienWidth,alienHeight);
        alienLVL2.scale(alienWidth,alienHeight);
    }
    public void act(){
        moveCounter++;
        if(alienCharge < 70){
            alienCharge++;
        }
        if(moveCounter >= 1 && moveCounter <= 50) {
            setLocation(getX(),getY()+1);
        }
        if(moveCounter >= 51 && moveCounter <= 100) {
            setLocation(getX(),getY()-1);
        }
        if(moveCounter == 100) {
            moveCounter = 0;
        }
        if(alienCharge == 70){
            AlienLaser alienLaser = new AlienLaser();
            getWorld().addObject(alienLaser,getX(),getY());
            alienCharge = 0;
        }
        PlayerLaser playerLaser = (PlayerLaser) getOneIntersectingObject(PlayerLaser.class);
        
        if(isTouching(PlayerLaser.class)){
            alienLives--;
            getWorld().removeObject(playerLaser);
        }
        
        if(alienLives == 2){
            setImage(alienLVL2);
        }
        if(alienLives == 1){
            setImage(alienLVL1);
        }
        if(alienLives == 0){
            getWorld().removeObject(this);
        }
    }
    
}
