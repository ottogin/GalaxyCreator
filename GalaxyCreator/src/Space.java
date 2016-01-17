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
	int counter;
	ImageLoader ImagesList;
	PhysicsControl control;
	
	public Space(int width, int height)
	{
		objects = new ArrayList<>();
		this.width = width;
		this.height = height;
		counter = 0;
		
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
	
	
	
}
