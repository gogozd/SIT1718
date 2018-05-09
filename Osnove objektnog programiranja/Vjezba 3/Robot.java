
public class Robot {
	
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private int ID = 4443443;
	private String name = "R2D2";
	
	public void walk() {
		System.out.println("I roboti znaju hodati.");
	}
		
	public static int rec(int n) {
		
		if(n == 1) {
			return 1;
		}
		return rec(n - 1) * n;
		
	}
}
