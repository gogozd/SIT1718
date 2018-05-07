import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
	
	private static Scanner sc;

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file = new File("tekstualna.txt");
		
		try {
			readFile(file);
		} catch(FileNotFoundException e) {
			System.out.println("File " + file.toString() + " nije pronadjen.");
		}
		
	}

	public static void readFile(File file) throws FileNotFoundException {
		
		sc = new Scanner(file);
		
		while(sc.hasNextLine()) {
			System.out.println(sc.hasNextLine());
		}
		sc.close();
	}
}
