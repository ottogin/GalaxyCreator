import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;

import System.ImageLoader;
import System.Vector2;


public class Space  
{

	private ArrayList<SpaceObject> objects;
	int width;
	int height;
	boolean is_center;
	boolean is_tracking;
	int counter;
	ImageLoader ImagesList;
	PhysicsControl control;
	
	public Space(int width, int height)
	{
		objects = new ArrayList<>();
		this.width = width;
		this.height = height;
		counter = 0;
		is_center = false;
		control = new PhysicsControl (objects);
	}
	
	public ArrayList<SpaceObject> getObjects() { return objects; }
	
	public int getHieght() { return height; }
	
	public int getWidth() { return width; }
	
	public void Update() 
	{
		control.calcPhysics();
	}
	
	public void Draw(Graphics2D g, Surface s)
	{
		for (int i = 0; i < objects.size(); i++)
		{
			objects.get(i).Draw(g, s);
			objects.get(i).DrawText(g, i*50);
		}
	}
	
	public void ChangeCentering(int c){
		if(!is_center)
		{
			for (int i = 0; i < objects.size(); i++)
			{
				objects.get(i).setMiddle(objects.get(c).pos);
				objects.get(i).clear_tr();
			}
			is_center = true; 
		}
		else
		{
			is_center = false;
			for (int i = 0; i < objects.size(); i++)
			{
				objects.get(i).setMiddle(new Vector2(0,0));
				objects.get(i).clear_tr();
			}
		}
	}
	
	public void ChangeTracking(){
		if(is_tracking)
		{
			for (int i = 0; i < objects.size(); i++)
			{
				objects.get(i).ChangeTracking();
				objects.get(i).clear_tr();
			}
			is_tracking = false;
		}
		else
		{
			for (int i = 0; i < objects.size(); i++)
			{
				objects.get(i).ChangeTracking();
			}
			is_tracking = true;
		}
	}
	public void PhysicStop(){
		control.Stop();
	}
	public PhysicsControl getControl(){
		return control;
	}
}
