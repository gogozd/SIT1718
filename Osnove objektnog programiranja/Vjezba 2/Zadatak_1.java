import java.util.Scanner;

public class Zadatak_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] PrviNiz = {"Vasa", "vana plurimum", "sonant"};
		String[] DrugiNiz = new String[4];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < DrugiNiz.length; i++) {

			System.out.println("Unesite string za "+ i +" element niza: ");
			DrugiNiz[i] = sc.nextLine();			
		}
		
		System.out.println(PrviNiz[0] + " " + PrviNiz[1] + " " + PrviNiz[2]);
		for (int i = 0; i < DrugiNiz.length; i++) {
			
			System.out.println(DrugiNiz[i]);

		}
	}
}
