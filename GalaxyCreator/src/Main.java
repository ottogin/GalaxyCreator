import javax.swing.JFrame;
import javax.swing.SwingUtilities;


public class Main {

		static public JFrame myWindow;
		public static void main (String [] args)
		{
			myWindow = new Frame();
			myWindow.setVisible(true);
			SwingUtilities.invokeLater(new Runnable()
			{
				public void run()
				{
					((Frame) myWindow).ButtonListener();
				}
			});
		}
		
		
}
