import java.util.ArrayList;

public class PrintIn3D {

	public PrintIn3D() {
		
	}
	
	public void printGoogles(int broj, Customer cust) {
		ArrayList<Googles> lista = new ArrayList<Googles>();
		
		for (int i=0; i < broj; i++) {
			Googles googles = new Googles();
			googles.getId();
			googles.setPrice(10);
			lista.add(googles);
		}
		
		Order order =new Order();
		order.CreateOrder(cust, lista);
	}
}
