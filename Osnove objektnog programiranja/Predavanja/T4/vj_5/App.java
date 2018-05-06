package meth;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TV tv = new TV();
		Lamp lamp = new Lamp();
		
		tv.activateIntelligentMode();
		tv.setBrightness(80);
		lamp.activateIntelligentMode();
		lamp.setBrightness(5);
	}

}
