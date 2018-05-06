
public class Camera extends Device {	// Camera nasljeduje metode iz Device

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Pokrecem fotoaparat");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Gasim fotoaparat");
	}

	@Override
	public void charge() {
		// TODO Auto-generated method stub
		System.out.println("Punim fotoaparat");
	}

	@Override
	public void operate() {
		// TODO Auto-generated method stub
		System.out.println("Slikam sa fotoaparatom");
	}

}
