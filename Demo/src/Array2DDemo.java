import java.util.Iterator;
import java.util.Scanner;

public class Array2DDemo {
	
	public static void accept2DArrayData(int arr1[][],int arr2[][]) {
		Scanner sc = new Scanner(System.in);
		//for(int k=1;k<3;k++) {
		System.out.println("Enter your 1st 2D array :");
	   for(int i=0;i<arr1.length;i++) {
		   for(int j=0;j<arr1[i].length;j++) {
			   arr1[i][j]=sc.nextInt(); 
		   }
	   }
	   
	  System.out.println("Enter your 2nd 2D array");
	  for (int i = 0; i < arr2.length; i++){
		  for (int j = 0; j < arr2[i].length; j++) {
			  arr2[i][j] = sc.nextInt();
		}
	}
	   
}
	//}
	   public static void displayData(int arr1[][],int arr2 [][]) {
			Scanner sc = new Scanner(System.in);
			//for(int k=0;k<2;k++) {
			System.out.println("Display your 1st 2D array");
		   for(int i=0;i<arr1.length;i++) {
			   for(int j=0;j<arr1[i].length;j++) {
				 System.out.print(arr1[i][j]+" ");
			   }
			   System.out.println();
		   }
					
			 System.out.println("Disaplay your 2nd 2D array");
			 for(int i=0;i<arr2.length;i++) {
				   for(int j=0;j<arr2[i].length;j++) {
					 System.out.print(arr2[i][j]+" ");
				   }
				   System.out.println();
			   }
		
	}	
	   public static void Additionof2DArray(int[][] arr1,int[][] arr2,int arr3[][]) {
		   System.out.println("Addition of two Arrays:");
		   for(int i=0;i<arr3.length;i++) {
			   for(int j=0;j<arr3[i].length;j++) {
				arr3[i][j]=arr1[i][j]+arr2[i][j];
			   }
			
		   }
		   for(int i=0;i<arr3.length;i++) {
			   for(int j=0;j<arr3[i].length;j++) {
				 System.out.print(arr3[i][j]+" ");
			   }
			   System.out.println();
		   }
		   
	   }
	   public static void multiplicationof2DArray(int[][] arr1,int[][] arr2,int[][] arr3) {
		   System.out.println("Multiplication of two matrix");
		    for (int i = 0; i < arr3.length; i++) {
		    	for (int j = 0; j < arr3[i].length; j++) {
		    		arr3[i][j]=arr1[i][j] * arr2[i][j];	
				}
			}
		    for (int i = 0; i < arr3.length; i++) {
		    	for (int j = 0; j < arr3[i].length; j++) {
		    		System.out.print(arr3[i][j]);
				}
		    	System.out.println();
			}
		  
		  
	   }
//	   public static void symatrix2DArray(int[][] arr1,int[][] arr2) {
//		   for(int i=0;i<arr1.length;i++) {
//			   for(int j=0;j<arr1[i].length;j++) {
//				   
//			   }
//		   }
//	   }

}
