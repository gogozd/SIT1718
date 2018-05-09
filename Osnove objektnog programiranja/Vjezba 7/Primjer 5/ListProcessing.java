import java.util.LinkedList;
import java.util.ListIterator;

public class ListProcessing {
	
	public static void insertVeh(String s, LinkedList<String> l) {
		
		ListIterator<String> litr = l.listIterator();
		
		while (litr.hasNext()) {
			if (litr.next().equals("electronic bike")) {
				litr.add(s);
			}
		}
		
	}
	
	
}
