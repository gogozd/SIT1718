import java.util.ArrayList;

public class ProcessList {
	
	private ArrayList<String> lista = new ArrayList<String>();

	public ProcessList(ArrayList<String> lista) {
		
		this.lista = lista;
	}
	
	public static void processingList(ArrayList<String> lista) {
		
		for(String str : lista) {
			System.out.println(str);
			System.out.println(str.length());
		}
		
	}
	
	public static void sortingListDesc(ArrayList<String> lista) {
		
		ArrayList<String> poredana = new ArrayList<String>();

		while(!lista.isEmpty()) {
            String bigger = "";
            for(String str : lista) {
                if(str.length() > bigger.length()) {
                    bigger = str;
                }
            }
            poredana.add(bigger);
            while(lista.contains(bigger)) {
                lista.remove(bigger);
            }
        }
		System.out.println(poredana.toString());
		
	}
	
	public static void calcCharacters(ArrayList<String> lista) {
		
		for(String str : lista) {
			System.out.println(str + " --> " + str.length());
		}
	}
}
