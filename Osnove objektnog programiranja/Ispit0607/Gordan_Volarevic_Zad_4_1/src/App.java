import java.util.ArrayList;
import java.util.Scanner;

public class App {
	
	private static ArrayList<String> procList = new ArrayList<String>();
	

	public static void main(String[] args) {

		popList();
		ProcessList.processingList(procList);
		ProcessList.calcCharacters(procList);
		ProcessList.sortingListDesc(procList);
		
	}

	public static void popList() {
		
		Scanner sc = new Scanner(System.in);
		String city;
		String izbor;
		boolean flag = true;
		
		while(flag) {
				System.out.println("Unesite grad: ");
				city = sc.nextLine();
				if(!city.matches(".*[a-zA-Z].*")) {
					System.out.println("Enter proper name for the city.");
				} else {
					procList.add(city);
				}
				
			System.out.println("Prekid unosa. y - nastavak ili n - prekid.");

			izbor = sc.nextLine();
			
			if("y".equalsIgnoreCase(izbor)) {
				flag = true;
			} else if ("n".equalsIgnoreCase(izbor)){
				flag = false;
			}
		}
		
	}
	
}
