// Potrebno je kreirati dvije klase PDS_Student i DS_Student koje proširuju nadklasu Student. Obje klase trabaju ponovno definirati
// metodu infoStud, a implementirati completingStudy koja je u polaznoj klasi deklariarana kao apstraktna. UML dijagram klasa za ovaj
// zadatak prikazan je na slici 1.

import java.text.ParseException;

public class App {

	public static void main(String[] args) throws ParseException {


		PDS_Student pds = new PDS_Student("Marta", 34534);
		DS_Student ds = new DS_Student("Ivano", 97932);

		// setting enrollment year

		pds.setEnrollmentDate(null);
		ds.setEnrollmentDate(null);

		pds.infoStud();
		ds.infoStud();

		System.out.println(pds.completingStudy(2));
		ds.completingStudy(2);
	}

}
