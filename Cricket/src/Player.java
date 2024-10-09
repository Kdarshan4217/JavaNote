
public class Player {


	 private int pid;
	 private String pname;
	 private String specility;
	public Player() {
		super();
	}
	public Player(int pid, String pname, String specility) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.specility = specility;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getSpecility() {
		return specility;
	}
	public void setSpecility(String specility) {
		this.specility = specility;
	}
	@Override
	public String toString() {
		return "Team [pid=" + pid + ", pname=" + pname + ", specility=" + specility + "]";
	}
	
	

}

