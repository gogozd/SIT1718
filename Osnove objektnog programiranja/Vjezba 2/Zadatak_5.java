import java.util.Arrays;

public class Zadatak_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] tablica = new int[12][2];
		int[] mjprofit = new int[12];
		int godprofit = 0;
		double prosprofit; 
		int[] prihodi = {125855, 284569, 324152, 204563, 452198, 471326, 505169, 498569, 367163, 289568, 115255, 98544};
		int[] rashodi = {105625, 155748, 198455, 195251, 257654, 322188, 355748, 315782, 389455, 302369, 109854, 85233};
		
		for (int i = 0; i < 12; i++) {
			tablica[i][0] = prihodi[i];
			for (int j = 0; j < 12; j++) {
				tablica[j][1] = rashodi[j];
			}
		}
		
		for (int i = 0; i < 12; i++) {
			mjprofit[i] = tablica[i][0] - tablica[i][1];
			godprofit = godprofit + mjprofit[i];
			System.out.println("Profit u " + (i + 1) + ". mjesecu: " + mjprofit[i]);
		}
		
		prosprofit = godprofit / 12;
		
		System.out.println("Godisnji profit: " + godprofit);
		System.out.println("Prosjecni profit po mjesecu: " + prosprofit);
		System.out.println(Arrays.deepToString(tablica));
		
	}

}
