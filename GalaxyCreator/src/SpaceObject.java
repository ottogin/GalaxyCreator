import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

import System.Vector2;


public class SpaceObject 
{
	float mass;
	float radius;
	float speed;
	Vector2 pos;
	Vector2 speedVector;
	private Image img;
	
	public float getMass() {
		return mass;
	}

	public void setMass(float mass) {
		this.mass = mass;
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

	public Vector2 getPos() {
		return pos;
	}

	public void setPos(Vector2 pos) {
		this.pos = pos;
	}

	public Vector2 getSpeedVector() {
		return speedVector;
	}

	public void setSpeedVector(Vector2 speedVector) {
		this.speedVector = speedVector;
	}

	public SpaceObject(float mass, float radius, float speed)
	{
		this.mass = mass;
		this.radius = radius;
		this.speed = speed;
		pos = new Vector2();
		pos.SetValue(400,  325);
		img = new ImageIcon("Earth.png").getImage();
	}
	
	public void move(int dx, int dy)
	{
		pos.x += dx;
		pos.y += dy;
	}
	
	public void Draw(Graphics2D g, Surface s)
	{
		g.drawImage(img, (int)pos.x, (int)pos.y, 50, 50, s);
	}
	
	
}
