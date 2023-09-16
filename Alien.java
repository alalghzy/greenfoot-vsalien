import greenfoot.*;
public class Alien extends Actor{
    int moveCounter = 0;
    int alienCharge = Greenfoot.getRandomNumber(150);
    public Alien(){
        GreenfootImage alien = getImage();
        int alienHeight = (int)alien.getHeight()*4;
        int alienWidth = (int)alien.getWidth()*4;
        alien.scale(alienWidth,alienHeight);
    }

    public void act(){
        moveCounter++;
        if(alienCharge < 150){
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
        if(alienCharge == 150){
            AlienLaser alienLaser = new AlienLaser();
            getWorld().addObject(alienLaser,getX(),getY());
            alienCharge = 0;
        }
        
        if(isTouching(PlayerLaser.class)){
            getWorld().removeObject(this);
        }
        
    }

}
