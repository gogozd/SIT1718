import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a;
		double b;
		double c;
		int brojac = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite vrijednost a: ");
		a = sc.nextDouble();
		System.out.println("Unesite vrijednost b: ");
		b = sc.nextDouble();
		
		for (int i = 1; i <= 50; i++) {
			c = (a + b) / 2;
			
			double jednadzba = (((2 * c - 1) / (Math.abs(4 - 2 * c))) + 1 - ((c) / (Math.abs (c - 2))));
			
			if (jednadzba > 0) {
				a = c;
			} else {
				b = c;
			}
			
			brojac = brojac + 1;
			System.out.println(brojac + ".) a = " + a + ", b = " + b);
			
			double d = Math.abs(a - b);
			
			if (d < 0.001) {
				System.out.println("Dozvoljena greska od 0.001 dobivena je u " + brojac + " pokusaju.");
				break;
			}
		}
	}

}
