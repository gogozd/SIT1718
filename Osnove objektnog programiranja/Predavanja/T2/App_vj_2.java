
public class App {

	public static void main(String[] args) {
		
		int a = 10;
		int b = a;	// referenca b na a

		Automobil a1 = new Automobil();	// kreiramo objekt a1
		a1.pokreniMotor();	// poziva se metoda pokreniMotor
		Automobil a2 = a1;	// referenca na a1
		a1.pokreniMotor();
		a2.pokreniMotor();
		
	}

		public static class Automobil {	// stvaramo klasu Automobil
										// trebalo dodati static zbog greske i
										// nije definiran konstruktor u klasi
			int KS = 170;	// varijable klase
			int V = 3000;
			String tip = "SUV";
			
		public void pokreniMotor() {	// metoda bez ulaznih elemenata unutar klase
			System.out.println("Motor je pokrenut.");
		}	
	}
}
