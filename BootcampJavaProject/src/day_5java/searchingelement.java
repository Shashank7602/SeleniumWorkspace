package day_5java;
import java.util.Scanner;
public class searchingelement {

		public static void main(String args[])
		{
			int A[]=new int[5];
			int element=12;
			Scanner s = new Scanner(System.in);
			System.out.println("enter the values of array: ");
			for(int i=0;i<A.length;i++)
			{
				A[i]=s.nextInt(); //reading the values
			}
			System.out.println("elements of array are: ");
			for(int i=0;i<A.length;i++)
			{
			//System.out.println(A[i]);//displaying the values
			if(element==A[i])
			{
				System.out.println("element is found");
				System.exit(0);
			}}
				System.out.println("element not found");
			}
}
