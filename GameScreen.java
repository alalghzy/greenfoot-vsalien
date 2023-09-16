import greenfoot.*;

public class GameScreen extends World{
    private int imageCount = 0;

    private GreenfootImage bgImage = new GreenfootImage("GameScreen.png");
    public GameScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 700, 1, true); 
        prepare();
        for(int i=75;i<=600;i+=95){
            addObject(new Alien(), 900, i);
        }
       
    }

    private void prepare(){
        SpaceShip spaceShip = new SpaceShip();
        addObject(spaceShip,100,350);

        LivesDisplay livesDisplay = new LivesDisplay();
        addObject(livesDisplay,120,633);
        WavesDisplay wavesDisplay = new WavesDisplay();
        addObject(wavesDisplay,133,67);
    }

    public void act(){
        imageCount -= 5;
        drawBackgroundImage();
        if (getObjects(Alien.class).isEmpty()){
            Greenfoot.setWorld(new GameScreen2());
        }
    }

    public void drawBackgroundImage() {
        if (imageCount < -bgImage.getWidth()) {
            imageCount += bgImage.getWidth();
        }
        int temp = imageCount;
        getBackground().drawImage(bgImage, temp, 0);
        getBackground().drawImage(bgImage, temp + bgImage.getWidth(), 0);
    }
}
