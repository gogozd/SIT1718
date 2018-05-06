
public class Mob extends Device {	// Mob nasljeduje metode iz Device

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Pokrecem mobitel");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Gasim mobitel");
	}

	@Override
	public void charge() {
		// TODO Auto-generated method stub
		System.out.println("Punim mobitel");
	}

	@Override
	public void operate() {
		// TODO Auto-generated method stub
		System.out.println("Pozivam preko mobitela");
	}

}
