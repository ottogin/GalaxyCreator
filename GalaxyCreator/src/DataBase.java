import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import System.Vector2;


public class DataBase {
	
	public static void save(Space space){
		try{
			BufferedWriter  out = new BufferedWriter(new FileWriter("Save.txt"));
			SpaceObject cur;
			out.write(space.getObjects().size() + "\n");
			for(int i = 0; i < space.getObjects().size(); i++){
				cur = space.getObjects().get(i);
				out.write(cur.mass + "\n");
				out.write(cur.radius + "\n");
				out.append(cur.pos.x + "\n" + cur.pos.y + "\n");
				out.append(cur.speedVector.x + "\n" + cur.speedVector.y + "\n");
				out.append(cur.ImageNumber + "\n");
			}
			out.flush();
			out.close();
			System.out.println("Save successfully");
		} catch (IOException e) {
			System.out.println("Can't write into file <Save.txt>");
		}
	}
	
	public static Space load(){
			Space space = new Space(500, 500);
		    try {
		    	BufferedReader br = new BufferedReader(new FileReader("Save.txt"));
		    	int i = Integer.parseInt(br.readLine());
		    	//System.out.println("Start loading.. " + i);
		        while(i > 0)
		        {
		        	//System.out.println("Find new planet..");
		        	
		        	SpaceObject obj = new SpaceObject(0, 0, null, null);
		        	
		            obj.setMass(Double.parseDouble(br.readLine()));
		            obj.setRadius(Double.parseDouble(br.readLine()));
		            obj.setPos(new Vector2(Double.parseDouble(br.readLine()), Double.parseDouble(br.readLine())));
		            obj.setSpeed(new Vector2(Double.parseDouble(br.readLine()), Double.parseDouble(br.readLine())));
		           // System.out.println("Understand!");
		            obj.setImageNumber(Integer.parseInt(br.readLine()));
		            
		            space.getObjects().add(obj);
		            
		            i--;
		        }
		        System.out.println("Load successfully");
		    } catch (FileNotFoundException e1) {
		            System.out.println("Can't read file <Save.txt>");
		    } catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    return space;
	}
}
