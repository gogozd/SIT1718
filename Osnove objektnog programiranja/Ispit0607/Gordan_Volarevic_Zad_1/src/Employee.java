import java.util.concurrent.ThreadLocalRandom;

public class Employee {

	private String name;
	private int id;
	Profession i;
	private double years;
	
	public Employee(String name, int id,Profession i, double years) {
		this.name = name;
		this.id = id;
		this.i = i;
		this.years = years;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Profession getI() {
		return i;
	}

	public void setI(Profession i) {
		this.i = i;
	}

	public double getYears() {
		return years;
	}

	public void setYears(double years) {
		this.years = years;
	}
	
}
