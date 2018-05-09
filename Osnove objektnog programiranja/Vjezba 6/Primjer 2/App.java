// Iz neke baze podataka dobili ste ispis koji sadrži sljedeće zapise (records):
// id = 21, Name = Stipe
// id = 159, Name = Divna
// id = 985, Name = Etna
// id = 455, Name = Petar
// id = 5788, Name = Vlatka
// Ukoliko smatramo da su id jedinstveni koju strukturu podataka bi koristili za pohranu ovih zapisa? Pohranite zapise u tu strukturu
// i potom ispišite sve elemente strukture korištenjem for each petlje.

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> data = new HashMap<>();
		data.put(21, "Stipe");
		data.put(159, "Divna");
		data.put(985, "Etna");
		data.put(455, "Petar");
		data.put(5788, "Vlatka");
		
		for(Map.Entry<Integer, String> unos : data.entrySet()) {
			System.out.println("id = " + unos.getKey() + " Name = " + unos.getValue());
		}
		
		TreeMap<Integer, String> stablomapa = new TreeMap<Integer, String>();
		stablomapa.putAll(data);
		
	}
	
	public static void ispis(String str) {
		
		for(Map.Entry<Integer, String> unos : map.entrySet()) {
			System.out.println("id = " + unos.getKey() + " Name = " + unos.getValue());
		
	}

}
