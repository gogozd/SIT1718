
public class Customer {

	private int id;
	private String name;
	private String adresa;
	private String mail;
	
	public Customer(int i, String a, String b, String c) {
		id = i;
		name = a;
		adresa = b;
		mail = c;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	
}
