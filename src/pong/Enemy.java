/**
 * 
 */
package pong;

import java.awt.Color;
import java.awt.Graphics;

/**
 * @author Kalleo
 *
 */
public class Enemy {
	
	public double x,y;
	public int width, height;

	public Enemy(int x, int y) {
		this.x = x;
		this.y = y;
		width = 40;
		height = 10;
	}
	
	public void tick() {
		if(x + width > Game.width) {
			x = Game.width - width;
		} else if(x < 0) {
			x = 0;
		}		
		x += (Game.ball.x - x - 6) * 0.07;
	}
	
	public void render(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect((int) x, (int) y, width, height);
	}
	
}
