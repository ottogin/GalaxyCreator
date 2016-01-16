import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class Frame extends JFrame 
{
	
	JButton planetBtn;
	JToolBar toolBar;
	JPanel panel;
	ObjectCreationFrame planetFrm;
	ObjectCreationFrame starFrm;
	
	Space space;
	
	public Frame ()
	{

		setTitle("Galaxy Creator");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		planetBtn = new JButton ("GalaxyCreator");
		panel = new JPanel();
		ButtonInitialize();
		space = new Space(500, 500);
		pack();
	}
	
	private void ButtonInitialize()
	{
		panel.add(planetBtn);
		setContentPane(panel);
		pack();
		
	}
	
	public void ButtonListener()
	{
		planetBtn.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				planetFrm = new PlanetCreator(space.getObjects());
				planetFrm.setVisible(true);
				SwingUtilities.invokeLater(new Runnable()
				{
					public void run()
					{
						((ObjectCreationFrame) planetFrm).ButtonListener();
					}
				});

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
