import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class App {

	private int id;
	
	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		int id = ThreadLocalRandom.current().nextInt();

		Employee em1 = new Employee("Vlatko", id, genProfession(), genYears());
		Employee em2 = new Employee("Ines", id, genProfession(), genYears());
		Employee em3 = new Employee("Vedrana", id, genProfession(), genYears());
		Employee em4 = new Employee("Ivana", id, genProfession(), genYears());
		Employee em5 = new Employee("Branko", id, genProfession(), genYears());
		Employee em6 = new Employee("Ana", id, genProfession(), genYears());
		Employee em7 = new Employee("Gorana", id, genProfession(), genYears());
		
		hm.put(em1, "dep1");
		hm.put(em2, "dep1");
		hm.put(em3, "dep1");
		hm.put(em4, "dep1");
		hm.put(em5, "dep2");
		hm.put(em6, "dep2");
		hm.put(em7, "dep2");
		
		System.out.println("////////// Department//////////");
		System.out.println(hm.get(em1));
		System.out.println(em1.getName() + ": " + em1.i);
		System.out.println(hm.get(em2));
		System.out.println(em2.getName() + ": " + em2.i);
		System.out.println(hm.get(em3));
		System.out.println(em3.getName() + ": " + em3.i);
		System.out.println(hm.get(em4));
		System.out.println(em4.getName() + ": " + em4.i);
		System.out.println("////////// Department//////////");
		System.out.println(hm.get(em5));
		System.out.println(em5.getName() + ": " + em5.i);
		System.out.println(hm.get(em6));
		System.out.println(em6.getName() + ": " + em6.i);
		System.out.println(hm.get(em7));
		System.out.println(em7.getName() + ": " + em7.i);
	}

	private static double genYears() {
		double years = ThreadLocalRandom.current().nextDouble(1, 35);
		return years;
	}
	
	private static Profession genProfession() {
		int i = ThreadLocalRandom.current().nextInt(1, 5);
		switch (i) {
		case 1:
			return Profession.Profession1;
		case 2:
			return Profession.Profession2;
		case 3:
			return Profession.Profession3;
		case 4:
			return Profession.Profession4;
		case 5:
			return Profession.Profession5;	
		}
		return null;
	}
	
}
