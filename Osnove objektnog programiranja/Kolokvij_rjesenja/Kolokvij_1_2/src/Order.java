import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Order {

	private static int cntr;
	private static Map<Integer, ArrayList<?>> orders = new HashMap<Integer, ArrayList<?>>();
	
	public Order() {
		
	}
	
public void CreateOrder(Customer cust, ArrayList<?> lista) {
		
		ArrayList tempList;
		   if (orders.containsKey(cust.getId())) {
		      tempList = orders.get(cust.getId());
		      if(tempList == null)
		         tempList = new ArrayList();
		      tempList.add(lista);  
		   } else {
		      tempList = new ArrayList();
		      tempList.add(lista);               
		   }
		   
		orders.put(cust.getId(), tempList);
		
	}
	
	public static Map<Integer, ArrayList<?>> getOmp(){
		
		return orders;
		
	}
	
	public ArrayList<Customer> getArrCust(){
		
		return null;
		
	}
	
	public void CalcOrderPrice(ArrayList<?> lista) {
		
	}
}
