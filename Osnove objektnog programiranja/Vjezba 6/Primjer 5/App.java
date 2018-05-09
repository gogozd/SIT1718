// Zadana je lista niza (ArrayList) u koju dodajete elemente tipa String (auto, svemirski brod, avion, helikopter, jedrilica,
// gliser, romobil, bicikla) u zadanom redoslijedu. Ispišite listu bez sortiranja. Otvorite API za sučelje Collections, pogledajte
// metodu sort i potom je primjenite na sortiranje vaše list. Kakav je sada rezultat?
// U drugom dijelu zadatka potrebno je sortirati elemente prema duljini stringa. Za tu svrhu koristite drugu definiciju metode sort
// u istom sučelju.

import java.util.ArrayList;
import java.util.Collections;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("auto");
		lista.add("svemirski brod");
		lista.add("avion");
		lista.add("helikopter");
		lista.add("jedrilica");
		lista.add("gliser");
		lista.add("romobil");
		lista.add("bicikla");
		
		System.out.println(lista);
		Collections.sort(lista);
		System.out.println(lista);
		
		Collections.sort(lista, new LengthStrComparator());
		
		for(String st: lista){
			  System.out.println(st);
			}
		
		Collections.sort(lista, new LengthStrComparatorRev());
		
		for(String st: lista){
			  System.out.println(st);
			}

	}

}
