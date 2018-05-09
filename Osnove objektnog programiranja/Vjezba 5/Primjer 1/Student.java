import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class Student {
	
	protected int idStud;
	protected String name;
	protected Date enrollmentDate;
	protected DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
	
	public int getIdStud() {
		return idStud;
	}

	public void setIdStud(int idStud) {
		this.idStud = idStud;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getEnrollmentDate() {
		return enrollmentDate;
	}

	public void setEnrollmentDate(String enrollmentDate) throws ParseException {
		System.out.println("Please enter enrollment date in the form dd-MM-yyyy");
		Scanner sc = new Scanner(System.in);
		String date = sc.nextLine();
		this.enrollmentDate = df.parse(date);
	}
	
	public void infoStud() {

		System.out.println("Student: " + this.name + ", id: " + idStud);
		System.out.println("Enrollment date: " + df.format(enrollmentDate));
	}

	public boolean completingStudy(int i) {
		return false;
	}
	
}
