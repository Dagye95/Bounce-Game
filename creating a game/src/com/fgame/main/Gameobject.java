package com.fgame.main;

import java.awt.Graphics;
import java.awt.Rectangle;

//every in game object will be inheriting from this abstract class
public abstract class Gameobject {	
	
	protected float x, y;  //protected means it can only be accessed by the object that inherits it
    protected ID id;
    protected float velX, velY; //controls speed in the x and y directions
    
    public Gameobject(float x, float y, ID id){ //presets the variables in the constructor class
    	this.x = x;
    	this.y = y;
    	this.id = id;
    	
    }
    public abstract void tick();
    public abstract void render(Graphics g); //
    public abstract Rectangle getBounds(); //sets a method that will deduct  health points if two rectangles collide 
 
    public void setX(int x){ // sets the parameters, in the protected section
    	this.x = x;
    }
    public void setY(int y){
    	this.y = y; 
    }
    
    public float getX(){
    	return x;
    }
    public float getY(){
    	return y;
    }
    public void setId(ID id){
    	this.id = id;
    }
    public ID getId() {
    	return id;
    }
    public void setVelX(int velX){
    	this.velX = velX;
    }
    public void setVelY(int velY){
    	this.velY = velY;
    }
    public float getVelX(){
    	return velX;
    }
    public float getVelY(){
    	return velY;
    }
}
