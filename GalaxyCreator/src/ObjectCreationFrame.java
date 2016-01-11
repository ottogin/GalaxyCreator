import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;


public abstract class ObjectCreationFrame extends JFrame  
{
	JSlider mass;
	JSlider radius;
	JSlider speed;
	JLabel massL;
	JLabel radiusL;
	JLabel speedL;
	JButton create;
	JPanel panel;
	int curMass = 0;
	int curRadius = 0;
	int curSpeed = 0;
	
	ArrayList<SpaceObject> obj;
	
	public ObjectCreationFrame (String type)
	{
		super ("Создание"+type);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setSize(400, 300);
		panel = new JPanel();
	}
	
	public abstract void ButtonInitialize();
	
	public abstract void ButtonListener();
	
}
