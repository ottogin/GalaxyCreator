import java.util.ArrayList;


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
}
