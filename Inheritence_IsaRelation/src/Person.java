import java.time.LocalDate;

public class Person {
	private int pid;
	private String Name;
	private String Adress;
	private LocalDate bdate;
	public Person() {
		super();
		System.out.println("this is person defult constructor");
	}
	
	public Person(int pid, String name, String adress, LocalDate bdate) {
		super();
		System.out.println("this is person para constructor");
		this.pid = pid;
		Name = name;
		Adress = adress;
		this.bdate = bdate;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAdress() {
		return Adress;
	}
	public void setAdress(String adress) {
		Adress = adress;
	}
	
	
	public LocalDate getBdate() {
		return bdate;
	}

	public void setBdate(LocalDate bdate) {
		this.bdate = bdate;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", Name=" + Name + ", Adress=" + Adress + ", bdate=" + bdate + "]";
	}

	
	
	

}
