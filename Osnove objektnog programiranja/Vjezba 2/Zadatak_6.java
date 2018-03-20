import java.util.Arrays;

public class Zadatak_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] niz = {12, 25, 65, 34, 325, 1, 346, 23, 8, 67, 49, 27, 59, 2, 5};
		int[] kopijaniza = Arrays.copyOf(niz, 15);
		System.out.println(Arrays.toString(niz));
		System.out.println(Arrays.toString(kopijaniza));
		System.out.println(Arrays.equals(niz, kopijaniza));
		if (Arrays.equals(niz, kopijaniza)) {
			System.out.println("Isti");
		} else {
			System.out.println("Razliciti");
		}
	}

}
