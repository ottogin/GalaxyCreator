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

import System.Vector2;


public class PlanetCreator extends ObjectCreationFrame {
	
	public PlanetCreator(ArrayList<SpaceObject> obj)
	{
		super(" �������");
		this.obj = obj;
		ButtonInitialize();
	}
	

	@Override
	public void ButtonInitialize() 
	{
		massL = new JLabel ("Mass");
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
		radiusL = new JLabel("Radius");
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
		speedLX = new JLabel("SpeedX");
		panel.add(speedLX);
		speedX = new JTextField("", 10);
		speedX.setCaretColor(Color.RED);
		speedX.setHorizontalAlignment(JTextField.LEFT);
		panel.add(speedX);
		powSpeedX = new JLabel ("*10^");
		panel.add(powSpeedX);
		speedexX = new JTextField("", 10);
		speedexX.setCaretColor(Color.RED);
		speedexX.setHorizontalAlignment(JTextField.LEFT);
		panel.add(speedexX);
		speedLY = new JLabel("SpeedY");
		panel.add(speedLY);
		speedY = new JTextField("", 10);
		speedY.setCaretColor(Color.RED);
		speedY.setHorizontalAlignment(JTextField.LEFT);
		panel.add(speedY);
		powSpeedY = new JLabel ("*10^");
		panel.add(powSpeedY);
		speedexY = new JTextField("", 10);
		speedexY.setCaretColor(Color.RED);
		speedexY.setHorizontalAlignment(JTextField.LEFT);
		panel.add(speedexY);
		XL = new JLabel ("X");
		panel.add(XL);
		X = new JTextField("", 10);
		X.setCaretColor(Color.RED);
		X.setHorizontalAlignment(JTextField.LEFT);
		panel.add(X);
		YL = new JLabel ("Y");
		panel.add(YL);
		Y = new JTextField("", 10);
		Y.setCaretColor(Color.RED);
		Y.setHorizontalAlignment(JTextField.LEFT);
		panel.add(Y);
		create = new JButton("Create");
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
				curMass = Double.parseDouble(mass.getText())*(double)Math.pow(10, Double.parseDouble(massex.getText()));
				curRadius = Double.parseDouble(radius.getText())*(double)Math.pow(10, Double.parseDouble(radiusex.getText()));
				curSpeedX = Double.parseDouble(speedX.getText())*(double)Math.pow(10, Double.parseDouble(speedexX.getText()));
				curSpeedY = Double.parseDouble(speedY.getText())*(double)Math.pow(10, Double.parseDouble(speedexY.getText()));
				curX = Double.parseDouble(X.getText());
				curY = Double.parseDouble(Y.getText());
				obj.add(new SpaceObject (curMass, curRadius, new Vector2 (curSpeedX, curSpeedY), new Vector2 (curX, curY)));
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