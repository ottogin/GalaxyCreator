import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.SwingUtilities;


public class DisplaySurface extends JFrame {
	JButton planetBtn;
	///
	JButton saveBtn;
	JButton traecBtn;
	JButton loadBtn;
	JButton centrBtn;
	JButton pouseBtn;
	JButton incBtn;
	JButton decBtn;
	Surface surface;
	///
	JToolBar toolBar;
	JPanel panel;
	JPanel panelBtn;
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
		panel.setLayout(new BoxLayout(panel, BoxLayout.LINE_AXIS));
		panelBtn = new JPanel();
		panelBtn.setLayout(new GridLayout(8, 1, 0, 10));
		panelBtn.setPreferredSize(new Dimension (50, 690));
		panelBtn.setMaximumSize(new Dimension (50, 400));
		space = new Space(500, 500); 
		surface = new Surface(space);
		panel.add(surface);
		panel.add(panelBtn);
		setLocation(0, 0);
		setTitle("Galaxy Creator");
		//setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		planetBtn = new JButton ("+");
		loadBtn = new JButton("L");
		saveBtn = new JButton("S");
		traecBtn = new JButton("T");
		pouseBtn = new JButton("P");
		centrBtn = new JButton("C");
		decBtn = new JButton("D");
		incBtn = new JButton("I");
		ButtonInitialize();
		
	}
	
	private void ButtonInitialize()
	{
		panelBtn.add(planetBtn);
		panelBtn.add(saveBtn);
		panelBtn.add(loadBtn);
		panelBtn.add(traecBtn);
		panelBtn.add(centrBtn);
		panelBtn.add(pouseBtn);
		panelBtn.add(incBtn);
		panelBtn.add(decBtn);
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
		
		centrBtn.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				space.ChangeCentering(3);
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
		
		traecBtn.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				space.ChangeTracking();
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
		pouseBtn.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				space.PhysicStop();
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
		
		incBtn.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				surface.incSpeed();

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
		
		decBtn.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				surface.decSpeed();

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
