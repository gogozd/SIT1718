import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// program sa unosom broja i ispisom istog
		int unos;	// definicija lokalnih varijabli
		Scanner sc = new Scanner(System.in);	// stvaranje scanner objekta imena sc
		System.out.println("Unesite broj: ");
		unos = sc.nextInt();	// unos prima unesenu vrijednost iz scannera
		
		System.out.println("Uneseni broj je: " + unos);
		
		sc.close();	// resource leak treba zatvoriti
		
	}

}
