package game;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

import classes.EntityA;
import classes.EntityB;

public class Enemy extends GameObject implements EntityB {

	private Textures tex;
	Random r = new Random();
	private Game game;
	private Controller c;

	private int speed = r.nextInt(3) + 1;

	Animation anim;

	public Enemy(double x, double y, Textures tex, Controller c, Game game){
		super(x, y);
		this.tex = tex;
		this.c = c;
		this.game = game;

		anim = new Animation(5, tex.enemy[0], tex.enemy[1], tex.enemy[2]);
	}

	public void tick(){
		y += speed;

		if(y > Game.HEIGHT * Game.SCALE){
			speed = r.nextInt(3) + 1;
			x = r.nextInt(640);
			y = -10;
		}

		for(int i = 0; i < game.ea.size(); i++)
		{
			EntityA tempEnt = game.ea.get(i);

			if(Physics.Collision(this, tempEnt))
			{
				c.removeEntity(tempEnt);
				c.removeEntity(this);
				game.setEnemy_killed(game.getEnemy_killed() + 1);
			}
		}

		anim.runAnimation();
	}

	public void render(Graphics g){
		g.drawImage(tex.enemy[0], (int)x, (int)y, null);
	}

	public Rectangle getBounds(){
		return new Rectangle((int)x, (int)y, 32, 32);
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
}
