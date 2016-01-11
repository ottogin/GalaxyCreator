import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class Frame extends JFrame 
{
	
	JButton planetBtn;
	JButton starBtn;
	JToolBar toolBar;
	JPanel panel;
	ObjectCreationFrame planetFrm;
	ObjectCreationFrame starFrm;
	
	Space space;
	
	public Frame ()
	{
		super ("GalaxyCreator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1200, 700);
		planetBtn = new JButton ("Создать планету");
		starBtn = new JButton ("Создать звезду");
		panel = new JPanel();
		ButtonInitialize();
		space = new Space(500, 500);
		pack();
	}
	
	private void ButtonInitialize()
	{
		panel.add(planetBtn);
		panel.add(starBtn);
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
		
		starBtn.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				starFrm = new StarCreator(space.getObjects());
				starFrm.setVisible(true);
				SwingUtilities.invokeLater(new Runnable()
				{
					public void run()
					{
						((ObjectCreationFrame) starFrm).ButtonListener();
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
