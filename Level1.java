import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrickWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends World
{
    private final float GRAVITY = 0.0667f;
    private final GreenfootSound MUSIC = new GreenfootSound("Background Music.mp3");
    private final int SPEED = 3;
    private final float JUMP_FORCE = 6f;
    private final int MAX_HEALTH = 3;
    private final int MAX_POWERUP = 3;
    private final Class NEXT_LEVEL = Level2.class;
    /**
     * Constructor for objects of class BrickWorld.
     * 
     */
    public Level1()
    {    
        // Create a new world with 1200x800 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1, false); 
        prepare();
    }
    
    public void act()
    {
        spawn();
    }   
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        setPaintOrder(Player.class, Platform.class, Obstacle.class, Collectable.class,
              Door.class, HUD.class);
              
        Door door = new Door();
        addObject(door,760,44);
        Player player = new Player(SPEED, JUMP_FORCE, GRAVITY, 
                                   MAX_HEALTH, MAX_POWERUP, NEXT_LEVEL, MUSIC);
        addObject(player,46,760);
        addObject(new Floor(), 600, 800);
        addObject(new BrickWall(), 400, 500);
        addObject(new BrickWall(), 500, 300);
        addObject(new BrickWall(), 700, 100);
        addObject(new SmBrickWall(), 900, 600);
        addObject(new SmBrickWall(), 880, 600);
        addObject(new SmBrickWall(), 1000, 450);
        addObject(new Bomb(GRAVITY), 1030, 410);
    }
    
         private void spawn()
    {
        if(Math.random() < 0.0025)
        {
            addObject(new Rock(GRAVITY), Greenfoot.getRandomNumber(1200), -30);
            addObject(new AcidRain(GRAVITY), Greenfoot.getRandomNumber(1200), -30);
        }
    }
}
