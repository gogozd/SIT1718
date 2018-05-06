
public class App {

	public static void main(String[] args) {
		// vjezba sa anonimnim klasama
		Mob mob = new Mob();
		mob.poruka(3);

		Mob smart = new Mob() {	// objekt koji nam treba za ograniceno vrijeme
			private int izbor;
			
			@Override	// radimo override metode iz klase Mob
			public void poruka(int iz) {
				switch(iz) {
				case 1: System.out.println("Smart i SMS"); break;
				case 2: System.out.println("Smart i MMS"); break;
				case 3: System.out.println("Smart i mail"); break;
				default: System.out.println("Smart nema tu mogucnost"); break;
				}
			}
		};
		
		smart.poruka(2);
		smart.razgovor();
	}

}
