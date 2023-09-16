import greenfoot.*; 
public class SpaceShip extends Actor{
    int charge = 0;
    int specialCharge = 0;
    public SpaceShip(){
        GreenfootImage spaceShip = getImage();
        int spaceShipHeight = (int)spaceShip.getHeight()*4;
        int spaceShipWidth = (int)spaceShip.getWidth()*4;
        spaceShip.scale(spaceShipWidth,spaceShipHeight);
        turn(90);
    }

    public void act(){
        if(charge < 30){
            charge++;
        }
        if(specialCharge < 180) {
            specialCharge++;
        }
        if(Greenfoot.isKeyDown("up")){
            setLocation(getX(),getY()-6);
        }
        if(Greenfoot.isKeyDown("down")){
            setLocation(getX(),getY()+6);
        }
        if(Greenfoot.isKeyDown("right")){
            setLocation(getX()+6,getY());
        }
        if(Greenfoot.isKeyDown("left")){
            setLocation(getX()-10,getY());
        }        
        if(Greenfoot.isKeyDown("Space") && charge == 30){
            PlayerLaser playerLaser = new PlayerLaser();
            getWorld().addObject(playerLaser,getX(),getY());
            Greenfoot.playSound("bullet.wav");
            charge = 0;
        }
        
        AlienLaser alienLaser = (AlienLaser) getOneIntersectingObject(AlienLaser.class);
        AlienBossLaser alienBossLaser = (AlienBossLaser) getOneIntersectingObject(AlienBossLaser.class);
        if(isTouching(AlienLaser.class)){
            LivesDisplay.lives--;
            getWorld().removeObject(alienLaser);
        }
        else if(alienBossLaser != null){
            LivesDisplay.lives--;
            getWorld().removeObject(alienBossLaser);
        }
        if(LivesDisplay.lives == 0)  {
            getWorld().removeObject(this);
            Greenfoot.setWorld(new EndScreen());
            LivesDisplay.lives = 15;
        }
        
    }
}