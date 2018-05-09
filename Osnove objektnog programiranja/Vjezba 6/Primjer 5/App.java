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
