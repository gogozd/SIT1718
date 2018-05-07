import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ages;
		Scanner sc = new Scanner(System.in);
		boolean proceed = true;
		int cnt = 1;
		
		while(proceed) {
			System.out.println("Unesi broj godina (kao tip integer): ");
			try {
				ages = sc.nextInt();
				if(ages < 0) {
					throw new Exception("Negativne godine nisu moguce.");
				}

			}
			catch(InputMismatchException e) {
				sc.next();
				System.out.println("Krivi unos, unesite cijeli broj.");
			}
			catch(Exception ex) {
				System.out.println("Greska." + ex.getMessage());
			} finally {
				System.out.println("1 za dalje, 2 za prekid.");
				if(sc.nextInt() == 1) {
					proceed = true;
					cnt++;
				} else {
					proceed = false;
					sc.close();
					System.out.println("Gotovo.");
				}
			}
		}

	}

}
