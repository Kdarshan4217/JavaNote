import java.time.LocalDate;

public class GraduateStudent extends Student {
	private int spub;
	public GraduateStudent() {
		
	}


	public GraduateStudent(int pid, String name, String adress, LocalDate bdate,float[] marks,int spub) {
		super(pid,name,adress,bdate,marks);
		System.out.println("GraduateStudent paramaterized constructor");
		this.spub = spub;
	}

	
	public int getSpub() {
		return spub;
	}

	public void setSpub(int spub) {
		this.spub = spub;
	}

	@Override
	public String toString() {
		return super.toString()+ "GraduateStudent [spub=" + spub + "]";
	}
	

}
