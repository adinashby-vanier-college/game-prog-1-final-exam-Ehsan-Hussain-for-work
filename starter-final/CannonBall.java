// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class CannonBall here.
 * @author (your name) @version (a version number or a date)
 */
public class CannonBall extends Actor
{
    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/
    private Point2D position;
    private Vector2D velocity;
    private Vector2D acceleration;

    /* 200 pixels is 1 meter*/

    /**
     * 
     */
    public CannonBall()
    {
        position = null;
        velocity =  new  Vector2D(0.0, 0.0);
    }

    /**
     * 
     */
    public void act()
    {
        updatePhysics();
    }

    /**
     * 
     */
    public void setVelocity(Vector2D newValue)
    {
        velocity = newValue;
    }

    /**
     * 
     */
    public void updatePhysics()
    {
        /* Initial position*/
        if (position == null) {
            position =  new  Point2D(getX(), getY());
        }
        /* Get time step duration*/
        MyWorld world = (MyWorld)getWorld();
        double dt = world.getTimeStepDuration();
        /* Update position*/
        Vector2D positionVariation = Vector2D.multiply(velocity, dt);
        position.add(positionVariation);
        /* Set new actor position*/
        setLocation((int)position.getX(), (int)position.getY());
    }
}
