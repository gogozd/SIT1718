// Kreirajte ArrayList i popunite je s elementima tipa String (5 proizvoljnih elemenata). Cijelu ArrayList dodajte u vezanu listu
// (LinkedList). Ispišite obje liste. Dodajte još jedan proizvoljni element na kraj vezane liste. Dodajte po jedan novi element na
// početak i na kraj vezane liste (koristite API za LinkedList). Ispišite tako proširenu listu upotrebom petlje for each. Napravite
// metodu koja će zamijeniti bilo koji element liste za uneseni indeks, ali na način da ga prvo izbriše. Upotrijebite metodu na peti
// element vezane liste i potom ispišite cijelu listu. Prikaz mogućeg konzolnog izlata nalazi se na Slici 1.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("Zero ind element");
		lista.add("Fst ind element");
		lista.add("Snd ind element");
		lista.add("Trd ind element");
		lista.add("Fth ind element");
		
		LinkedList<String> llista = new LinkedList();
		llista.addAll(lista);
		
		System.out.println("*****ArrayList*****");
		System.out.println("ArrayLista: " + lista);
		System.out.println("*****LinkedList*****");
		System.out.println("LinkedList: " + llista);
		
		lista.add("Fst added on end");
		
		llista.add(0, "New zero element");
		llista.add("New last element");
		
		for(String txt : llista) {
			System.out.println(txt);
		}
		
		zamjena(4, "Zamjenjeni element", llista);
	}
		
		public static void zamjena(int i, String str, List<String> llista) {
			llista.set(i, str);
			System.out.println(llista);
		}
	
}
