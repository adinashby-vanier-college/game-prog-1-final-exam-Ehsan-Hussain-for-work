// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class Cannon here.
 * @author (your name) @version (a version number or a date)
 */
public class Cannon extends Actor
{
    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/
    /* Act - do whatever the Cannon wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.*/
    private static final double CANNON_BALL_VELOCITY = 1500.0;

    /**
     * 
     */
    public void act()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        Vector2D cannonToMouse =  new  Vector2D(getX(), getY());
        alignWithVector(cannonToMouse);
        if (Greenfoot.mouseClicked(null)) {
            cannonToMouse.normalize();
            cannonToMouse = Vector2D.multiply(cannonToMouse, CANNON_BALL_VELOCITY);
            CannonBall newBall =  new  CannonBall();
            newBall.setVelocity(cannonToMouse);
            getWorld().addObject(newBall, getX(), getY());
        }
    }

    /* public void act() { if (mouse != null) { Vector2D cannonToMouse = new Vector2D(mouse.getX() - getY(), mouse.getY() - getY());double adjacent = cannonToMouse.getX(); double opposite = cannonToMouse.getY();double angleRadians = Math.atan2(opposite, adjacent); double angleDegrees = Math.toDegrees(angleRadians);setRotation((int) angleDegrees); } }*/

    /**
     * 
     */
    public void alignWithVector(Vector2D v)
    {
        double adjacent = v.getX();
        double opposite = v.getY();
        double angleRadians = Math.atan2(opposite, adjacent);
        double angleDegrees = Math.toDegrees(angleRadians);
        setRotation((int)angleDegrees);
    }
}
