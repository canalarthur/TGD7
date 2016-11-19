package entity.movable.Circle;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import fr.vision.Area;

public class Guard extends Character {
	private double radius; 
	protected Area visualField;
	
	public Guard(double x, double y, double sx, double sy, /*Image im,*/ Area visuFie) {
		super(x, y, sx, sy, null);
		//this.visualField=visuFie;
	}

	//------------------------------Get--------------
	
	public Area getVisualField() {
		return visualField;
	}

	//------------------------------Set--------------
	
	public void setVisualField(Area visualField) {
		this.visualField = visualField;
	}
	
	public void update(GameContainer arg1, StateBasedGame arg2, int arg3) throws SlickException  {
		
	}
	
	public void render(GameContainer arg1, StateBasedGame arg2, Graphics arg3) throws SlickException {
		arg3.setColor(Color.magenta);
		arg3.fillOval((float)x, (float)y, (float)(2*radius), (float)(2*radius));
	}
	
	public void movX(double x, double sx, double count, double bool, int delta){
		if (bool == 1){
			while (x<count){
				moveX(delta);
			}
			bool=-1;
		}
		else{
			while (x>-count){
				moveX(delta);
			}
			bool=1;
		}
	}

	
}
