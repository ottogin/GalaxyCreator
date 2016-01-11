import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class StarCreator extends ObjectCreationFrame 
{

	public StarCreator(ArrayList<SpaceObject> obj)
	{
		super (" звезды");
		this.obj = obj;
		ButtonInitialize();
	}
	
	@Override
	public void ButtonInitialize() 
	{
		massL = new JLabel ("Масса");
		panel.add(massL);
		mass = new JSlider (JSlider.HORIZONTAL, 0, 1000, 100);
		mass.setMajorTickSpacing(200);
		mass.setMinorTickSpacing(10);
		mass.setPaintTicks(true);
		mass.setPaintLabels(true);
		mass.setSnapToTicks(true);
		panel.add(mass);
		radiusL = new JLabel("Радиус");
		panel.add(radiusL);
		radius = new JSlider (JSlider.HORIZONTAL, 0, 1000, 100); 
		radius.setMajorTickSpacing(200);
		radius.setMinorTickSpacing(10);
		radius.setPaintTicks(true);
		radius.setPaintLabels(true);
		radius.setSnapToTicks(true);
		panel.add(radius);
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
			public void mouseClicked(MouseEvent arg0) 
			{
				mass.addChangeListener(new ChangeListener()
				{

					@Override
					public void stateChanged(ChangeEvent arg0) {
						curMass = ((JSlider) arg0.getSource()).getValue();
					}
					
				});
				
				radius.addChangeListener(new ChangeListener()
				{

					@Override
					public void stateChanged(ChangeEvent arg0) 
					{
						curRadius = ((JSlider)arg0.getSource()).getValue();
					}
					
				});
				
				obj.add(new SpaceObject (curMass, curRadius, curSpeed));
				
				System.out.println(curMass+" "+curRadius+" "+curSpeed);
				
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
