import java.util.Scanner;

public class Zadatak_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double V ;
		double r ;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite polumjer: ");
		r = sc.nextFloat();
		
		V = (4 * Math.PI * Math.pow(r, 3))/3;
		System.out.println(V);
	}

}
