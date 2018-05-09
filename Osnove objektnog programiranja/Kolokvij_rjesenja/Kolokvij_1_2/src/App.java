import java.util.ArrayList;
import java.util.Iterator;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customers customers = new Customers();

		createCustomer(1, "Mladen", "Splitska 1", "mladen@gmail.com", customers);
		createCustomer(2, "Djoni", "Splitska 2", "djoni@gmail.com", customers);
		createCustomer(3, "Mile", "Splitska 3", "mile@gmail.com", customers);
		
		PrintIn3D print= new PrintIn3D();
		
		print.printGoogles(5, customers.getHmc().get(1));
		print.printGoogles(10, customers.getHmc().get(1));
		print.printGoogles(8, customers.getHmc().get(3));
		
		
		Iterator<Integer> it = Order.getOmp().keySet().iterator();
		ArrayList<?> tempList;
		  int broj_nar=0;
		  
		   while (it.hasNext()) {
		      int key = it.next(); 
		     
		      tempList = Order.getOmp().get(key);
		      if (tempList != null) {
		         for (Object value: tempList) {
		        	 System.out.println("Customer: "+customers.getHmc().get(key).getName());
		        	 System.out.println(value);
		        	 ArrayList al1 = (ArrayList) value;
		        	 
		        	 int cijena=0;
		        	 
		        	 for (int i=0; i<al1.size();i++) {
		        		 Googles g =(Googles) al1.get(i);
		        		 cijena+=g.getPrice();
		        	 }
		        	 
		        	System.out.println("Order price:" + cijena);
		        	System.out.println("\n");
		            broj_nar++;
		         }
		      }
		   }
		
		
		   
		System.out.println("Ukupan broj naruðbi: "+broj_nar);
		
	
	}
	
	public static void createCustomer(int id, String name, String adresa, String email, Customers mapa) {
		
		Customer cust = new Customer(id, name, adresa, email);
		mapa.addCustomer(cust.getId(), cust);
	}

}
