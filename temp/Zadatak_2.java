import java.util.Scanner;

public class Zadatak_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int broj;
		double prosjek;
		double suma = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj mjerenja: ");
		
		broj = sc.nextInt();
		
		double[] mjerenja = new double[broj];
		
		for (int i = 0; i < broj; i++) {
			
			System.out.println("Unesite vrijednost temperature: ");
			mjerenja[i] = sc.nextDouble();
			
		}
		
		for (int i = 0; i < broj;i++) {
			
			suma = mjerenja[i] + suma;
		
		}
		
		prosjek = suma/broj;
		
		System.out.println("Prosjecna temperatura iz broja mjerenja: " + prosjek);
		System.out.println("Broj mjerenja: " + broj);
	}

}
