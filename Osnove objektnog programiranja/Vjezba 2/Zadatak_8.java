import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;

public class Zadatak_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double[] niz = new Double[15];
		
		for (int i = 0; i < 15; i++) {
			niz[i] = ThreadLocalRandom.current().nextDouble();
		}
		System.out.println(Arrays.toString(niz));
		Arrays.sort(niz, Collections.reverseOrder());
		System.out.println(Arrays.toString(niz));
	}

}
