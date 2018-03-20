import java.util.Scanner;

public class Zadatak_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int broj;
		double prosjek;
		double suma = 0;
		int ispod = 0;
		int iznad = 0;
		int jednak = 0;
		
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
		
		for (int i = 0; i < broj; i++) {
			if (mjerenja[i] < prosjek) {
				ispod = ispod + 1;
			} else if (mjerenja[i] > prosjek) {
				iznad = iznad + 1;
			} else {
				jednak = jednak + 1;
			}
		
		System.out.println("Prosjecna temperatura iz broja mjerenja: " + prosjek);
		System.out.println("Broj mjerenja: " + broj);
		System.out.println("Broj mjerenja ispod prosjecne temperature: " + ispod);
		System.out.println("Broj mjerenja iznad prosjecne temperature: " + iznad);
		System.out.println("Broj mjerenja jednakim sa prosjecnom temperaturom: " + jednak);
		}
	}

}
