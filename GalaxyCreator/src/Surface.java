import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

class Surface extends JPanel implements ActionListener {

	private Image background;
	private Image earth;
	private Image sun;
	private Image venera;
	private Image mars;
	private Timer timer;
	Space space;
	private final int DELAY = 10;

	public Surface(Space space) {
		this.space = space;
		loadImage();
		setSurfaceSize();
		timer = new Timer(DELAY, this);
	    timer.start();
	}

	private void loadImage() {
		background = new ImageIcon("Background.jpg").getImage();
		earth = new ImageIcon("Earth.png").getImage();
		sun = new ImageIcon("sun.png").getImage();
		venera = new ImageIcon("Venera.png").getImage();
		mars = new ImageIcon("Mars.png").getImage();
	}

	private void setSurfaceSize() {

		Dimension d = new Dimension();
		d.width = 1300;
		d.height = 680;
		setPreferredSize(d);
	}

	private void doDrawing(Graphics g) {

		Graphics2D g2d = (Graphics2D) g;
		g2d.drawImage(background, 0, 0, null);

		//g2d.drawImage(earth, 400+DisplaySurface.x, 325, 50, 50, this);
		space.Draw(g2d, this);
		/*g2d.drawImage(sun, 750, 300, 100, 100, this);
		g2d.drawImage(sun, 900, 300, 75, 75, this);
		g2d.drawImage(venera, 550, 325, 50, 50, this);
		g2d.drawImage(mars, 250, 325, 50, 50, this);*/
	}

	@Override
	public void paintComponent(Graphics g) {
	
		super.paintComponent(g);
		doDrawing(g);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		space.Update();
		repaint();
		
	}
}

