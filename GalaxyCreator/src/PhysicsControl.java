import java.util.ArrayList;

import System.Vector2;


public class PhysicsControl 
{

	private double G = 6.67E-11;
	private double dt = 5E4;
	private double NormalSpeed = 4E4;
	
	ArrayList<SpaceObject> obj;
	
	public PhysicsControl(ArrayList<SpaceObject> obj)
	{
		this.obj = obj;
	}
	
	public void calcForce ()
	{	
		double forceX = 0;
		double forceY = 0;
		double force;
		double d;
		
		for (SpaceObject i : obj)
		{
			i.getForce().SetZero();
			for (SpaceObject j : obj)
			{
				forceX = 0;
				forceY = 0;
				force = 0;
				d = i.getPos().Distance(j.getPos());
				if (d != 0){
					force = G*i.getMass()*j.getMass()/Math.pow(d, 2);
					if(j.getPos().x - i.getPos().x != 0)
						forceX = force * ((j.getPos().x - i.getPos().x)/d);
					if(j.getPos().y - i.getPos().y != 0)
						forceY = force * ((j.getPos().y - i.getPos().y)/d);
				}
				//if (i.ImageNumber == 1)
				//System.out.println("X = "+ i.getForce().x +" Y = "+ i.getForce().y);	
				i.updateForce(forceX, forceY);
			}
		}
	}
	
	public void calcDA ()
	{
		for (SpaceObject i : obj)
		{
			i.setAcceleration(i.getForce().x/i.getMass(), i.getForce().y/i.getMass());
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
	
	public void Stop(){
		if(dt == 0)
			dt = NormalSpeed;
		else
			dt = 0;
	}
	
	public void calcPhysics ()
	{
		calcForce();
		calcDA();
		calcDV();
		calcDR();
	}
	
	
}
