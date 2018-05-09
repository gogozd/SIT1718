import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person implements CommonActions{

	protected String name;
	protected Date dob;
	protected DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
	
	public Person(String name, Date dob) {
		super();
		this.name = name;
		this.dob = dob;
	}

	@Override
	public void walk(String str, int i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void talk(String str) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void think(String str) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calculate(int i) {
		// TODO Auto-generated method stub
		
	}

}
