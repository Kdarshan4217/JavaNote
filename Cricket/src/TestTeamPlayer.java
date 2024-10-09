import java.util.Scanner;

public class TestTeamPlayer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int choices=0;
		do {
			System.out.println("1.Add new team\n2.Display all the teams\n3.Search player by id\n4.Search team by id\n5.Add new player in team\n6.exit\nchoices");
			choices=sc.nextInt();
			switch(choices) {
			case 1:TeamServices.AddNewTeam();
			}
		}while(choices!=6);
		

	}

}
