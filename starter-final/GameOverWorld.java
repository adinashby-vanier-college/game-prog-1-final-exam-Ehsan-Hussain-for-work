// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class GameOverWorld extends World
{

    /**
     * Constructor - shows the messege of showTextWithBigBlackFont and plays the appropreat sound effect.
     */
    public GameOverWorld()
    {
        super(560, 560, 1);
        showTextWithBigBlackFont("Game Over", 180, 200);
        Greenfoot.playSound("lose.wav");
    }

    /**
     * showTextWithBigBlackFont - sets the conditions of the text on screen.
     */
    public void showTextWithBigBlackFont(String message, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new  Font(50);
        bg.setFont(font);
        bg.setColor(Color.RED);
        bg.drawString(message, x, y);
    }
}
