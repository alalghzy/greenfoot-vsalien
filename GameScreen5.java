import greenfoot.*;  
public class GameScreen5 extends World{
    private int imageCount = 0;

    private GreenfootImage bgImage = new GreenfootImage("GameScreen.png");
    public GameScreen5()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 700, 1, true); 
        prepare();
    }
    
    private void prepare(){
        SpaceShip spaceShip = new SpaceShip();
        addObject(spaceShip,100,350);

        LivesDisplay livesDisplay = new LivesDisplay();
        addObject(livesDisplay,120,633);
        WavesDisplay wavesDisplay = new WavesDisplay();
        addObject(wavesDisplay,133,67);
        WavesDisplay.wave = 5;
        Boss boss = new Boss();
        addObject(boss,913,140);
        BossLivesDisplay bossLivesDisplay = new BossLivesDisplay();
        addObject(bossLivesDisplay,597,71);
        removeObject(bossLivesDisplay);
        
        addObject(bossLivesDisplay,423,70);
        bossLivesDisplay.setLocation(383,67);
    }

    public void act(){
        imageCount -= 5;
        drawBackgroundImage();
        if (getObjects(Boss.class).isEmpty()){
            Greenfoot.setWorld(new WinScreen());
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
