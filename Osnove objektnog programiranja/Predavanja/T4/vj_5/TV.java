package meth;

import java.util.Date;
import inter.Functionality;

public class TV implements Functionality {	// klasa TV implementira sucelje Functionaliity
	
	private String brand;
	private String model;
	private Date date;

	@Override
	public void activateIntelligentMode() {	// nasljedena metoda 
		// TODO Auto-generated method stub
		System.out.println("Pljesak za promjenu programa.");	// upisujemo sto metode radi
	}

	@Override
	public boolean setBrightness(int num) {
		// TODO Auto-generated method stub
		if(100 > num & num > 0) {
			System.out.println("Nivo svjetline: " + num);
			return true;
		} else {
			System.out.println("Izvan raspona svjetline.");
			return false;
		}
	}

}
