// Načinite vezanu listu vozila i popunite je sa sljedećim elementima: car, helicopeter, electronic bike, truck, motorcycle, carriage
// Vezanu listu vozila je potrebno ispisati upotrebom for each petlje u zasebnoj metodi glavnog programa koju ćete nazavti printList.
// Primjenom while petlje i Iteratora (pogledajte API za sučelje Iterator) za listu vozila ispišite sve elemente liste (dobit ćete
// isti rezultat kao s printList), ali istovremeno provjeravajte listu sadrži li element "carriage". Ako sadrži izbrišite taj
// element, a u protivnom lista ostaje ista. Nakon petlje while ponovno ispišite listu.

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> llista = new LinkedList<String>();
		llista.add("car");
		llista.add("helicopter");
		llista.add("electronic bike");
		llista.add("truck");
		llista.add("motorcycle");
		llista.add("carriage");
		
		printList(llista);
		
		Iterator<String> itr = llista.iterator();
		while (itr.hasNext()) {
			if (itr.next().equals("carriage")) {
				itr.remove();
			}
		}
				
		printList(llista);
		
		ListProcessing.insertVeh("Stagecoach", llista);
		
		printList(llista);
		
	}

	public static void printList(LinkedList<String> llista) {
		for(String txt : llista) {
			System.out.println(txt);
		}
	}
	
}
