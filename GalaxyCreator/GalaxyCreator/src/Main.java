import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;


public class Main {

		public static void main (String [] args)
		{
			EventQueue.invokeLater(new Runnable() {
				@Override
				public void run() {
					JFrame ex = new DisplaySurface();
					ex.setVisible(true);
					((DisplaySurface)ex).ButtonListener();
				}
			});
		}
		
		
}
