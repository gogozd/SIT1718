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
