import java.util.HashMap;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hmap = new HashMap<>();
		
		hmap.put(23, "Kreso");
		hmap.put(12, "Jole");
		hmap.put(35, "Mladen");
		hmap.put(7, "Sime");
		hmap.put(87, "Mile");
		
		for(Integer key : hmap.keySet()) {
			System.out.println("Kljuc: " + key + " - Vrijednost: " + hmap.get(key));
		}
	}

}
