import java.util.Date;
import java.text.SimpleDateFormat;

public class Person1 {
     private int pid;
     private String name;
     private String mobileno;
     private Date bdate;
     
     public Person1() {
    	 this(0,null,null,null);
     }

	public Person1(int pid, String name , String mb, Date date) {
		// TODO Auto-generated constructor stub
		this.pid=pid;
		this.name=name;
		mobileno=mb;
		this.bdate=date;
	}
	
	//setter methods
	public void setPname(String name) {
		this.name=name;
	}
	public void setMobile(String mob) {
		mobileno=mob;
	}
	public void setDate(Date date) {
		bdate=date;
	}
	
	//getter methods
	public int getPerid() {
		return pid;
	}
	public String getPname() {
		return name;
	}
	public String getMobileNum() {
		return mobileno;
	}
	
	public Date getDate() {
		return bdate;
	}
	public String toString() {
//		System.out.println(bdate);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String date1 = sdf.format(bdate);
		return "Id "+pid+"\nname "+name+"\nmoblie number :"+mobileno+"\n Birth Date : "+date1;
	}
	

	

}
