import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class ImageLoader {
		private ArrayList<Image> Images;
		
		public ImageLoader(){
			//Images = new ArrayList<>();
			//Images.add(new ImageIcon("Sun.png").getImage());
			//Images.add(new ImageIcon("Earth.png").getImage());
			//Images.add(new ImageIcon("Venera.png").getImage());
			//Images.add(new ImageIcon("Mars.png").getImage());
		}
		
		public Image getImage(int i){
			return Images.get(i);
		}
		
		public String getName(int i){
			if(i == 1) 	return "Sun.png";
			if(i == 2) 	return "Earth.png";
			if(i == 3) 	return "Venera.png";
			if(i == 4) 	return "Mars.png";
			return "Sun.png";
		}
}
