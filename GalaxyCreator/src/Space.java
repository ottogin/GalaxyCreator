import java.awt.Graphics2D;
import java.util.ArrayList;

import System.Vector2;


public class Space  
{
	private ArrayList<SpaceObject> objects;
	int width;
	int height;
	
	public Space(int width, int height)
	{
		objects = new ArrayList<>();
		this.width = width;
		this.height = height;
	}
	
	public ArrayList<SpaceObject> getObjects() { return objects; }
	
	public int getHieght() { return height; }
	
	public int getWidth() { return width; }
	
	public void Update() 
	{
		for(int i = 0; i <  objects.size(); i++)
		{
			objects.get(i).move(3, 0);
		}
	}
	
	public void Draw(Graphics2D g, Surface s)
	{
		for (SpaceObject i : objects)
		{
			i.Draw(g, s);
		}
	}
}
