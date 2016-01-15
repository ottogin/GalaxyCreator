import java.util.ArrayList;

import System.Vector2;


public class PhysicsControl 
{

	private double G = 6.67E-11;
	private double dt = 1;
	
	ArrayList<SpaceObject> obj;
	
	public PhysicsControl(ArrayList<SpaceObject> obj)
	{
		this.obj = obj;
	}
	
	public void calcForce ()
	{
		double forceX = 0;
		double forceY = 0;
		
		for (SpaceObject i : obj)
		{
			for (SpaceObject j : obj)
			{
				if (i.getPos().x - j.getPos().x != 0)
					forceX = G*i.getMass()*j.getMass()/Math.pow((i.getPos().x - j.getPos().x), 2);
				if (i.getPos().y - j.getPos().y != 0)
					forceY = G*i.getMass()*j.getMass()/Math.pow((i.getPos().y - j.getPos().y), 2);
				if (i.getPos().x - j.getPos().x > 0)
					forceX *= -1;
				if (i.getPos().y - j.getPos().y > 0)
					forceY *= -1;
				System.out.println("X = "+ forceX +" Y = "+ forceY);
				i.updateForce(forceX, forceY);
			}
		}
	}
	
	public void calcDA ()
	{
		for (SpaceObject i : obj)
		{
			i.setAcceleration(new Vector2(i.getForce().x/i.getMass(), i.getForce().y/i.getMass()));
		}
	}
	
	public void calcDV ()
	{	
		for (SpaceObject i : obj)
		{
			i.updateSpeed(i.getAcceleration().x*dt, i.getAcceleration().y*dt);
		}
	}
	
	public void calcDR ()
	{
		for (SpaceObject i : obj)
		{
			i.updateCoord(i.getSpeed().x*dt, i.getSpeed().y*dt);
		}
	}
	
	public void calcPhysics ()
	{
		calcForce();
		calcDA();
		calcDV();
		calcDR();
	}
	
	
}
