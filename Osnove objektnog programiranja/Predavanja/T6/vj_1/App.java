import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("src/tekstualna.txt");
		Scanner sc;
		
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			sc.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Nije pronadjen file. " + file.toString());
			
		}

	}

}
