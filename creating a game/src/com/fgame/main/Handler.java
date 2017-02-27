package com.fgame.main;

import java.awt.Graphics;
import java.util.LinkedList;

//maintains, updates and renders all the objects on the game. loops through all the objects, updates and rendes them
public class Handler {
	
	LinkedList<Gameobject> object = new LinkedList<Gameobject>();	
    public int spd = 5;
    
	public void tick(){
		for(int i =0; i < object.size(); i++){ //loops through the game loop
			Gameobject tempObject = object.get(i);
			
			tempObject.tick();
			
		}
	}
	
	public void render(Graphics g){
		for(int i = 0; i < object.size(); i++){
			Gameobject tempObject = object.get(i);
			
			tempObject.render(g);
		}
	}
	
	public void clearEnemys(){
		for(int i = 0; i < object.size(); i++){
			Gameobject tempObject = object.get(i);
			
			if(tempObject.getId() == ID.Player)
			{   
				object.clear();
				if(Game.gameState != Game.STATE.End)
				addObject(new Player((int)tempObject.getX(), (int)tempObject.getY(), ID.Player, this));
			}
			
		}
	}
	public void addObject(Gameobject object){
		this.object.add(object);
	}
	
	public void removeObject(
			Gameobject object){ //handles adding and removing ingame objects
		this.object.remove(object);
		
	}
	}
