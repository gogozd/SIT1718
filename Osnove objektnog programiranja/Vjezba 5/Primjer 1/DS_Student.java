
public class DS_Student extends Student {

	public DS_Student(String name, int i) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.idStud = i;
	}

	@Override
	public void infoStud() {
		// TODO Auto-generated method stub
		super.infoStud();
		
		System.out.println("Student je upisan na diplomski studij.");

	}

	@Override
	public boolean completingStudy(int i) {
		// TODO Auto-generated method stub
		return super.completingStudy(i);
	}

	
	
}
