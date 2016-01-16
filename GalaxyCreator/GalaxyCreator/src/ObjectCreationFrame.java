import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public abstract class ObjectCreationFrame extends JFrame  
{
	JTextField mass;
	JTextField radius;
	JTextField massex;
	JTextField radiusex;
	JTextField speedX;
	JTextField speedY;
	JTextField speedexX;
	JTextField speedexY;
	JTextField X;
	JTextField Y;
	JLabel massL;
	JLabel radiusL;
	JLabel speedLX;
	JLabel speedLY;
	JLabel powSpeedX;
	JLabel powSpeedY;
	JLabel powMass;
	JLabel powRadius;
	JLabel XL;
	JLabel YL;
	JButton create;
	JPanel panel;
	double curMass = 0;
	double curRadius = 0;
	double curSpeedX = 0;
	double curSpeedY = 0;
	double curX = 0;
	double curY = 0;
	
	ArrayList<SpaceObject> obj;
	
	public ObjectCreationFrame (String type)
	{
		super ("Planet"+type);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setSize(400, 300);
		panel = new JPanel();
	}
	
	public abstract void ButtonInitialize();
	
	public abstract void ButtonListener();
	
}
