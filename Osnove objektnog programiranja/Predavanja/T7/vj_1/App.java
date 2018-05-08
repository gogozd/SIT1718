import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SpaceShip sp1 = new SpaceShip("Enterprise", 23543, 250);
		SpaceShip sp2 = new SpaceShip("Galactica", 65346, 300);
		SpaceShip sp3 = new SpaceShip("Millenium Falcon", 432, 350);

		try(FileOutputStream fos = new FileOutputStream(new File("src/spcShips.bin"))){
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(sp1);
			oos.writeObject(sp2);
			oos.writeObject(sp3);
			oos.close();
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException ex) {
			ex.printStackTrace();
		}
		
		try(FileInputStream fis = new FileInputStream(new File("src/spcShips.bin"))){
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			while(fis.available() > 0) {
				SpaceShip sp;
				sp = (SpaceShip) ois.readObject();
				sps.add(sp);
			}
			ois.close();
		
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			System.out.println("");
			for(SpaceShip sp : sps) {
				System.out.println(sp.toString());
			}
		}
	}

}
