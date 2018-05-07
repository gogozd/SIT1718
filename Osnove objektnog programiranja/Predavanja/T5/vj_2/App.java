import java.util.ArrayList;
import java.util.LinkedList;

public class App {

	public static void main(String[] args) {
		// ne radi
		
		ArrayList<String> arl = new ArrayList<>();
		LinkedList<String> lst = new LinkedList<>();
		
		populateList("ArrayList", arl);
		populateList("LinkedList", lst);
		listAllElements("ArrayList", arl);

		private static void listAllElements(String type, List<String> list) {
			
			System.out.println("Tip liste: " + type);
			
			for(String st : list) {
				System.out.println("Index: " + list.indexOf(st) + " : " + st);
			}
		}
		
		private static void populateList(String type, List<String> list) {
			
			long start = System.currentTimeMillis();
			System.out.println("Dodajem element listi tipa: " + type);
			
			for(int i = 0; i < 100; i++) {
				list.add("Dodano.");
			}
			long stop = System.currentTimeMillis();
		}
	}

}
