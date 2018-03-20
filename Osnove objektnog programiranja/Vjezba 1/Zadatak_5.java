import java.util.Scanner;

public class Zadatak_5 {

	  public static void main(String[] args){
		    long sum = 0;
		    int br = 1;
		    long N;
		    
	        Scanner sc = new Scanner(System.in);
			System.out.println("Unesite N: ");
			N = sc.nextLong();
			
			if(N > Integer.MAX_VALUE) {
				System.out.println("Unesena vrijednost je veca od maksimalno dopustene.");
				
			} else {
		 
				while(br <= N){
					sum = sum + br;
					br = br + 1;
					}
				}
				System.out.println("Suma prvih N prirodnih brojeva: " + sum);
	  		}
		}