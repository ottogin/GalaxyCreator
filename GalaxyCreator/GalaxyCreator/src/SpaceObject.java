import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

import System.Vector2;


public class SpaceObject 
{
	double mass;
	double radius;
	Vector2 pos;
	Vector2 speedVector;
	Vector2 forceVector;
	Vector2 acceleration;
	
	ImageLoader ImagesList;
	int ImageNumber;
	Image img;
	
	public double getMass() {
		return mass;
	}

	public void setMass(double mass) {
		this.mass = mass;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Vector2 getSpeed() {
		return speedVector;
	}

	public void setSpeed(Vector2 speedVector) {
		this.speedVector = speedVector;
	}

	public Vector2 getPos() {
		return pos;
	}

	public void setPos(Vector2 pos) {
		this.pos = pos;
	}
	
	public void setForce(Vector2 force)
	{
		this.forceVector = force;
	}
	
	public Vector2 getForce() { return forceVector;}
	
	public void setImageNumber (int num)
	{
		this.ImageNumber = num;
		img = new ImageIcon(ImagesList.getName(num)).getImage();
	}
	
	public void updateForce (double dfx, double dfy)
	{
		double Fx = forceVector.x;
		double Fy = forceVector.y;
		forceVector.SetValue(Fx + dfx, Fy + dfy);
	}
	
	public void updateAcceleration (double dax, double day)
	{
		double Ax = acceleration.x;
		double Ay = acceleration.y;
		acceleration.SetValue(Ax + dax, Ay + day);
	}
	
	public void updateSpeed (double dVx, double dVy)
	{
		double Vx = speedVector.x;
		double Vy = speedVector.y;
		speedVector.SetValue(Vx + dVx, Vy + dVy);
	}
	
	public void updateCoord (double dx, double dy)
	{
		double x = pos.x;
		double y = pos.y;
		pos.SetValue(x + dx, y + dy);
	}
	
	public void setAcceleration (double x, double y)
	{
		acceleration.x = x;
		acceleration.y = y;
	}
	
	public Vector2 getAcceleration ()
	{
		return acceleration;
	}

	public SpaceObject(double mass, double radius, Vector2 speedVector, Vector2 pos, int imn)
	{
		this.mass = mass;
		this.radius = radius;
		this.speedVector = speedVector;
		this.pos = pos;
		
		forceVector = new Vector2();
		forceVector.SetZero();
		acceleration = new Vector2();
		acceleration.SetZero();
		
		ImagesList = new ImageLoader();
		ImageNumber = imn;
		img = new ImageIcon(ImagesList.getName(imn)).getImage();
	}
	
	public void Draw(Graphics2D g, Surface s)
	{
		g.drawImage(img, (int)pos.x, (int)pos.y, 50, 50, s);
	}
	
	
}
