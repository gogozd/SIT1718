import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Zadatak_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = -2147483648;
		int[][] niz = new int[3][4];
		
		for (int i = 0; i < niz.length; i++) {
			for(int j = 0; j < niz[0].length; j++) {
				niz[i][j] = ThreadLocalRandom.current().nextInt();
			}
		}
		System.out.println(Arrays.deepToString(niz));
		
		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz[i].length; j++) {
				if (niz[i][j] > max) {
					max = niz[i][j];
				}
			}
		}
		System.out.println("Maksimalna vrijednost 2D niza iznosi: " + max);
	}

}
