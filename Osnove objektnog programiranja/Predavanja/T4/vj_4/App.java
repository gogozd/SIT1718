
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Camera cam = new Camera();	// stvaramo objekte iz podklasa
		Mob mob = new Mob();
		
		cam.describeDev();
		mob.describeDev();
		
		cam.start();
		mob.charge();
	}

}
