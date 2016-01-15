import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.SwingUtilities;


public class DisplaySurface extends JFrame {
	JButton planetBtn;
	///
	JButton saveBtn;
	JButton loadBtn;
	Surface surface;
	///
	JToolBar toolBar;
	JPanel panel;
	ObjectCreationFrame planetFrm;
	ObjectCreationFrame starFrm;
	
	public static Space space;
	
	public DisplaySurface() 
	{
		initUI();
	}

	private void initUI() 
	{
		panel = new JPanel();
		space = new Space(500, 500); 
		surface = new Surface(space);
		panel.add(surface);
		setLocation(0, 0);
		setTitle("Galaxy Creator");
		//setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		planetBtn = new JButton ("+");
		loadBtn = new JButton("L");
		saveBtn = new JButton("S");
		ButtonInitialize();
		
	}
	
	private void ButtonInitialize()
	{
		panel.add(planetBtn);
		panel.add(saveBtn);
		panel.add(loadBtn);
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
		
		////
		saveBtn.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				DataBase.save(space);
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
		
		////
		
		loadBtn.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				space = DataBase.load();
				surface.setSpace(space);
				//System.out.println(space.getObjects().size());
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
