import java.util.Scanner;

public class TestArray2DDemo extends Array2DDemo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers of rows and cols:");
		int n=sc.nextInt();
		
		int[][] arr1=new int[n][n];
		int[][] arr2 = new int[n][n];
		int[][] arr3=new int[n][n];
		int choices=0;
		do {
			System.out.println("1.Accept 2 2D arrays\n2.Display 2 2D arrays\n3.Add two arrays\n4.Multiply two arrays\n5.Check wether both arrays are symmetric\6.exist");
			choices=sc.nextInt();
			switch(choices) {
			case 1:accept2DArrayData(arr1,arr2);
			break;
			case 2:displayData(arr1,arr2);
			break;
			case 3:Additionof2DArray(arr1,arr2,arr3);
			break;
			case 4:multiplicationof2DArray(arr1,arr2,arr3);
			break;
//			case 5:symatrix2DArray(arr1,arr2,arr3);
//			break;
			
			}
		}while(choices!=5);

	}

}
