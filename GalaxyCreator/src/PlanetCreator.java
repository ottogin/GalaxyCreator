import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class PlanetCreator extends ObjectCreationFrame {
	
	public PlanetCreator(ArrayList<SpaceObject> obj)
	{
		super(" планеты");
		this.obj = obj;
		ButtonInitialize();
	}
	

	@Override
	public void ButtonInitialize() 
	{
		massL = new JLabel ("Масса");
		panel.add(massL);
		mass = new JTextField("", 10);
		mass.setCaretColor(Color.RED);
		mass.setHorizontalAlignment(JTextField.LEFT);
		panel.add(mass);
		powMass = new JLabel ("*10^");
		panel.add(powMass);
		massex = new JTextField("", 10);
		massex.setCaretColor(Color.RED);
		massex.setHorizontalAlignment(JTextField.LEFT);
		panel.add(massex);
		radiusL = new JLabel("Радиус");
		panel.add(radiusL);
		radius = new JTextField("", 10);
		radius.setCaretColor(Color.RED);
		radius.setHorizontalAlignment(JTextField.LEFT);
		panel.add(radius);
		powRadius = new JLabel ("*10^");
		panel.add(powRadius);
		radiusex = new JTextField("", 10);
		radiusex.setCaretColor(Color.RED);
		radiusex.setHorizontalAlignment(JTextField.LEFT);
		panel.add(radiusex);
		speedL = new JLabel("Скорость");
		panel.add(speedL);
		speed = new JTextField("", 10);
		speed.setCaretColor(Color.RED);
		speed.setHorizontalAlignment(JTextField.LEFT);
		panel.add(speed);
		powSpeed = new JLabel ("*10^");
		panel.add(powSpeed);
		speedex = new JTextField("", 10);
		speedex.setCaretColor(Color.RED);
		speedex.setHorizontalAlignment(JTextField.LEFT);
		panel.add(speedex);
		create = new JButton("Создать");
		panel.add(create);
		setContentPane(panel);
		pack();
	}
	
	@Override
	public void ButtonListener()
	{
		create.addMouseListener(new MouseListener()
		{

			@Override
			public void mouseClicked(MouseEvent arg0) {
				curMass = Float.parseFloat(mass.getText())*(float)Math.pow(10, Float.parseFloat(massex.getText()));
				curRadius = Float.parseFloat(radius.getText())*(float)Math.pow(10, Float.parseFloat(radiusex.getText()));
				curSpeed = Float.parseFloat(speed.getText())*(float)Math.pow(10, Float.parseFloat(speedex.getText()));
				obj.add(new SpaceObject (curMass, curRadius, curSpeed));
				System.out.println(curMass+" "+ curRadius+" "+ curSpeed);
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
			
		}
	}
