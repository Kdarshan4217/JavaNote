import java.util.Scanner;

public class TestClassPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int choices=0;
		do {
		 System.out.println("1.Add new Person\n 2.Serch ById\n 3.Serach ByName\n 4.Delete Person\n 5.Modify Mobile\n 6.Display All Person\n 7.exit " );
		 choices = sc.nextInt();
	
		
		switch (choices) {
		
		case 1: PersonServices.addPerson();
	    break;
	    
		case 2:
			System.out.println("Enter a id for search");
			int id = sc.nextInt(); 
			Person1 per =PersonServices.searchById(id);
			if(per!= null) {
				System.out.println(per);
			}
			else {
				System.out.println("the sraech id is not found");
			}
			break;
		case 3:
			System.out.println("Enter the name for search ");
			sc.nextLine();
			String nm=sc.nextLine();
			Person1 per1=PersonServices.searchByName(nm);
			if(per1!=null) {
				System.out.println(per1);
				}
			else {
				System.out.println("the name not found");
			}
	
	    
		case 6:Person1[] arr=PersonServices.displayAll();
			for(Person1 p1:arr) {
				if(p1!=null) {
					System.out.println(p1);
				}
				else {
					break;
				}
			}
		}
		
		
		}while(choices!=7);
	}

}
