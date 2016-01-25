import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import System.ImageLoader;
import System.Vector2;


public class SpaceObject 
{
	double mass;
	double radius;
	Vector2 pos;
	Vector2 speedVector;
	Vector2 forceVector;
	Vector2 acceleration;
	ArrayList<Vector2> trajectory;
	String force;
	boolean is_tracking;

	Color color;
		
	Vector2 midleobj;
	int imgRad;
	int counter;
	
	ImageLoader ImagesList;
	int ImageNumber;
	Image img;
	
	private double magicRconst = 8E8;
	
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
		if (num == 1)
		{
			imgRad = 60;
		}
		else 
		{
			imgRad = 36;
		}
		if (num == 1)
			color = new Color(255, 255, 0);
		else if (num == 2)
			color = new Color(0, 255, 0);
		else if (num == 3)
			color = new Color(255, 255, 240);
		else if (num == 4)
			color = new Color(255, 0, 0);
		else 
			color = new Color(100, 149, 237);
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

	public void setMiddle (Vector2 midleobj)
	{
		this.midleobj = midleobj;
	}
	
	public void setMiddle (float x, float y)
	{
		this.midleobj.SetValue(x, y);
	}
	
	public void clear_tr(){
		trajectory.clear();
	}
	
	public void ChangeTracking(){
		if(is_tracking)
			is_tracking = false;
		else
			is_tracking = true;
	}
	
	public SpaceObject(double mass, double radius, Vector2 speedVector, Vector2 pos, int imn)
	{
		this.mass = mass;
		this.radius = radius;
		this.speedVector = speedVector;
		this.pos = pos;
		this.is_tracking = false;
		midleobj = new Vector2(0, 0);
		
		ImagesList = new ImageLoader();
		this.ImageNumber = imn;
		img = new ImageIcon(ImagesList.getName(imn)).getImage();
		if (imn == 1)
		{
			imgRad = 60;
		}
		else 
		{
			imgRad = 36;
		}
		
		Initialize();
	}
	
	public void Initialize()
	{
		forceVector = new Vector2();
		forceVector.SetZero();
		acceleration = new Vector2();
		acceleration.SetZero();
		
		
		force = new String();


		trajectory = new ArrayList<>();
		
	}
	
	
	public void Draw(Graphics2D g, Surface s)
	{
		if(is_tracking)	
			trajectory.add (new Vector2 (pos.x - midleobj.x, pos.y - midleobj.y));
		for (Vector2 i: trajectory)
		{	
			g.setColor(color);
			g.drawLine((int)((i.x)/magicRconst)+550+imgRad/2, (int)((i.y)/magicRconst)+350+imgRad/2, (int)((i.x)/magicRconst)+550+imgRad/2, (int)((i.y)/magicRconst)+350+imgRad/2);
		}
		g.drawImage(img, (int)((pos.x - midleobj.x)/magicRconst)+550, (int)((pos.y - midleobj.y)/magicRconst)+350, imgRad, imgRad, s);
	}
	
	public void DrawText(Graphics2D g, int height)
	{
		if (counter % 50 == 0)
			force = "X = "+ getForce().x +"    Y = "+ getForce().y;
		g.setColor(Color.WHITE);
		g.drawString(force, 800, height);
		counter++;
	}
	
	
}
