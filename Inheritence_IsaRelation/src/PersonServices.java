import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class PersonServices {
	 static Student [] s ;
	 static int count;
	 
	 static {
		 count = 0;
		 s[0]= new GraduateStudent(1,"ak","pune",LocalDate.of(2003,12,12),new float[] {92.8f,96.5f} ,89);
		 s[1]=new GraduateStudent(13, "Mugdha", "Pune", LocalDate.of(1999, 02, 13), new float[] {78,75},77);
	     s[2]=new MasterStudent(14, "Sahil", "Mumbai", LocalDate.of(2002, 01, 03), new float[] {88,87},"accounts","BCOM",89);
	     count =3;
	 
	 }
	 
	 
	 

	 
	public static void acceptNewData(int ch) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id");
		int id = sc.nextInt();
		
		System.out.println("Enter name");
		String name = sc.next();
		
		System.out.println("Enter adress");
		String adress = sc.next();
		
		System.out.println("Enter date(dd/MM/yyyy");
		String bdate = sc.next();
		LocalDate ldt=LocalDate.parse(bdate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

		
	    if(ch==1 || ch==2) {
	    	float[] marks1=new float[2];
	    	System.out.println("Enter the 1st mark");
	    	marks1[0]=sc.nextFloat();
	    	marks1[1]=sc.nextFloat();
	    	
	    	if(ch==1) {
	    		System.out.println("enter marks for special subject");
	    		int spsud=sc.nextInt();
	    		s[count]=new GraduateStudent(id,name,adress,ldt,marks1,spsud);
	    		
	    	}
	    	else {
	    		System.out.println("Enter thesis subject");
	    		String tsubject=sc.next();
	    		System.out.println("Enter masters Degree");
	    		String Degree=sc.next();
	    		System.out.println("Enter thesis marks");
	    		int tmrk=sc.nextInt();
	    		s[count]=new MasterStudent(id,name,adress,ldt,marks1,tsubject,Degree,tmrk);
	    	}
	    	
	    }
	    count++;
			
		
	}





	public static Student[] displayAll() {
		// TODO Auto-generated method stub
		
		return s;
	}

}
