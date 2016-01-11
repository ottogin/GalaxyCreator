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
	JTextField speed;
	JTextField massex;
	JTextField radiusex;
	JTextField speedex;
	JLabel massL;
	JLabel radiusL;
	JLabel speedL;
	JLabel powSpeed;
	JLabel powMass;
	JLabel powRadius;
	JButton create;
	JPanel panel;
	float curMass = 0;
	float curRadius = 0;
	float curSpeed = 0;
	
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
