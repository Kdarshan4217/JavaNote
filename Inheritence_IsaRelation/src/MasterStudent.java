import java.time.LocalDate;

public class MasterStudent extends Student {
	private String thesissubject;
	private String degree;
	private float tmarks;
	
	
	public MasterStudent() {
	
	}

	public MasterStudent(int pid, String name, String adress, LocalDate bdate, float[] marks,String thesissubject, String degree, float tmarks) {
		super(pid, name, adress, bdate, marks);
		this.thesissubject = thesissubject;
		this.degree = degree;
		this.tmarks = tmarks;
		// TODO Auto-generated constructor stub
	}

	public String getThesissubject() {
		return thesissubject;
	}

	public void setThesissubject(String thesissubject) {
		this.thesissubject = thesissubject;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public float getTmarks() {
		return tmarks;
	}

	public void setTmarks(float tmarks) {
		this.tmarks = tmarks;
	}

	@Override
	public String toString() {
		return super.toString()+"MasterStudent [thesissubject=" + thesissubject + ", degree=" + degree + ", tmarks=" + tmarks + "]";
	}

	

}
