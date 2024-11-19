// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Ladybug extends Actor
{

    /**
     * Act - do whatever the Hero wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        mover();
        if (isGameWon()) {
            transitionToGameWonWorld();
        }
        if (isGameOver()) {
            transitionToGameOverWorld();
        }
    }

    /**
     * mover - makes the Hero move or turn in the direction that the player presses on, using the arrow keys.
     */
    public void mover()
    {
        if (Greenfoot.isKeyDown("up")) {
            move(4);
        }
        if (Greenfoot.isKeyDown("left")) {
            turn(-4);
        }
        if (Greenfoot.isKeyDown("down")) {
            move(-4);
        }
        if (Greenfoot.isKeyDown("right")) {
            turn(4);
        }
    }

    /**
     * isGameWon - checks if the Ladybug hits the FinishLocation.
     */
    public boolean isGameWon()
    {
        World world = getWorld();
        FinishLocation a = (FinishLocation)getOneIntersectingObject(FinishLocation.class);
        if (a != null) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * transitionToGameWonWorld - shows the player to the win screen.
     */
    public void transitionToGameWonWorld()
    {
        World gameWonWorld =  new  GameWonWorld();
        Greenfoot.setWorld(gameWonWorld);
    }

    /**
     * isGameOver - checks if the Ladybug hits a CannonBall.
     */
    public boolean isGameOver()
    {
        World world = getWorld();
        CannonBall b = (CannonBall)getOneIntersectingObject(CannonBall.class);
        if (b != null) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * transitionToGameOverWorld - shows the player to the losing screen.
     */
    public void transitionToGameOverWorld()
    {
        World gameOverWorld =  new  GameOverWorld();
        Greenfoot.setWorld(gameOverWorld);
    }
}
