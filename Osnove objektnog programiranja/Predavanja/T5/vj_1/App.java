import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Apple> arPack = new ArrayList<>();	// pravimo arraylistu
		Apple ap;
		
		for(int i = 1; 1 < 4; i++) {
			ap = new Apple("RedDel", i);
			arPack.add(new Apple("RedDelicious", i));	// popunjavamo listu
			
			if(i == 3) {	// javlja error zbog razlicitih objekata ja mislim, jer lista prima samo tip Apple
				Orange or = new Orange("Esp", 3);
				arPack.add(or);
				
			}
		}

		for(Apple a : arPack) {
			System.out.println(a.toString());
		}
	}

}
