package meth;

import java.util.Date;
import inter.Functionality;

public class Lamp implements Functionality {
	
	private Date yearProd;

	@Override
	public void activateIntelligentMode() {
		// TODO Auto-generated method stub
		System.out.println("Pljeskanje za pali/gasi");
	}

	@Override
	public boolean setBrightness(int num) {
		// TODO Auto-generated method stub
		if(10 > num & num > 0) {
			System.out.println("Nivo svjetline: " + num);
			return true;
		} else {
			System.out.println("Izvan raspona svjetline.");
			return false;
		}
	}

}
