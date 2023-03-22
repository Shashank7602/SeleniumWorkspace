package day_5java;
import java.util.Scanner;
public class readdisplay2D {

	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int A[][];
		A= new int[3][3];
		System.out.println("enter the elements of array: ");
		for(int i=0;i<A.length;i++)
		{
			for(int j=0;j<A[0].length;j++)
			{
				A[i][j] = s.nextInt();
	
			}
		}
		System.out.print("The Array is :\n");
	    for (int i = 0; i < A.length; i++) {
	      for (int j = 0; j < A[0].length; j++) {
	        System.out.print(A[i][j] + "  ");
	      }
	      System.out.println();
	    }
	}
}
