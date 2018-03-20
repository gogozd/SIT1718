import java.util.Scanner;

public class Zadatak_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x ;
		int c ;	
		int y ;

		Scanner sc = new Scanner(System.in);
		System.out.println("Upiši jedan cijeli broj:");
		x = sc.nextInt();

		System.out.println("Upiši jedan cijeli broj:");
		c = sc.nextInt();
		
		y = (3 * x - c);
		
		System.out.println("Rezultat za y: " + y);
		
	}

}
