import java.util.Scanner;

public class TestinheritenceArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		do {
			System.out.println("1. Accept new data\n2. Delete student\n3. update marks\n");
			System.out.println("4. display all Graduate Student\n5. Display all master student\n6.Find Grade\n7. display all\n8. Exit\n Choice:");
			
			choice = sc.nextInt();
			
			switch(choice) {
	
			case 1 :System.out.println("1.GraduateStudent\n2.MastersStudents\n3.Facalty");
			int ind=sc.nextInt();
				PersonServices.acceptNewData(ind);
			break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:Student[] s=PersonServices.displayAll();
			for(Student s1:s) {
				if(s!=null) {
					System.out.println(s);
				}else {
					break;
				}
			}
			
				break;
			case 8:System.out.println("Thank you for visiting.....");
				break;
			default:System.out.println("choice is not aviable");
				break;
				
			}
			
			
			
			
		}while(choice!=9);
	}

}
