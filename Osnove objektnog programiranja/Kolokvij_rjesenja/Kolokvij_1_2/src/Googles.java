import java.util.concurrent.ThreadLocalRandom;

public class Googles {

	private int id;
	private static String BEST;
	private static int price;
	
	public Googles() {
		
		
	}

	public int getId() {
		this.id = ThreadLocalRandom.current().nextInt(1, 150000);
		return id;
	}

	public void setId(int id) {
		this.id = ThreadLocalRandom.current().nextInt(1, 150000);
	}

	public static String getBEST() {
		return BEST;
	}

	public static void setBEST(String bEST) {
		BEST = bEST;
	}

	public static int getPrice() {
		return price;
	}

	public static void setPrice(int price) {
		Googles.price = price;
	}
}
