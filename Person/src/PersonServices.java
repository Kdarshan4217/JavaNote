import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

public class PersonServices {

	public static Person1[] p1 ;
	public static int count;
	static {
		 p1 = new Person1[10];
		 p1[0]=new Person1(1,"Ram","24354786",new Date("1/2/3443"));
		 p1[1]=new Person1(2,"Seeta","86759463",new Date("2/4/5654"));
		 p1[2]=new Person1(3,"XYZ","47874565",new Date("5/56/767"));
		 count=3;
	}
	public static void addPerson() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id:");
		int perid=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the name:");
	    String name1=sc.nextLine();
	    System.out.println("Enter the mobile number:");
	    String mobile=sc.next();
	    System.out.println("Enter birthdate (dd/MM/yyyy)");
	    String date=sc.next();
	    
	    SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
	    Date dt=null;
        try {
        	dt=sdf.parse(date);
        }catch(ParseException e) {
        	e.printStackTrace();
        }
        p1[count]=new Person1(perid,name1,mobile,dt);
        count++;
		
		
	}
	public static Person1[] displayAll() {
		return p1;
	}
	
	
	public static Person1 searchById(int id) {
		// TODO Auto-generated method stub
       for (Person1 per1 : p1) {
    	   if(per1!=null) {
    		   if(per1.getPerid()==id) {
    			   return per1;
    		   }
    		  
    		   } else
    			   return null;
	    }
	return null;
			
	}
	public static Person1 searchByName(String nm) {
		// TODO Auto-generated method stub
		for(Person1 per2:p1) {
			if(per2!=null) {
				if(per2.getPname()==nm) {
					return per2;
				}
			}
			else {
				return null;
			}
		}
		return null;
	}
	
	
	

}
