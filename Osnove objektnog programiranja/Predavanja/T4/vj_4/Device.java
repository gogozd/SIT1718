
public abstract class Device {	// definiramo apstraktnu klasu

	public void describeDev() {
		System.out.println("Generalan opis koji vrijedi za Device");
	}
	
	public abstract void start();	// apstraktne metode koje se deklariraju
	public abstract void stop();	// ne mora se definirati tijelo metode
	public abstract void charge();
	public abstract void operate();
	
}
