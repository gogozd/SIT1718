import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Unesite koliko brojeva zelite generirati: ");
		Scanner sc = new Scanner(System.in);
		int broj = sc.nextInt();
		
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		for(int i = 1; i <= broj; i++) {
			int nasumicni = ThreadLocalRandom.current().nextInt(10, 1000);
			lista.add(nasumicni);
		}

		System.out.println(lista);
		Collections.sort(lista);
		System.out.println(lista);
		
		
		Collections.sort(lista, new Comparator<Integer>() {

			@Override
			public int compare(Integer arg0, Integer arg1) {
				// TODO Auto-generated method stub
				if(arg0 < arg1) {
					return 1;
				} else if(arg0 > arg1) {
					return -1;
				} else {
					return 0;
				}
			}
			
		});

		System.out.println(lista);
		
	}

}
