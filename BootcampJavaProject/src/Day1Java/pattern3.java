package Day1Java;

import java.util.Scanner;

public class pattern3 {

	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
	      System.out.print("input the number: ");
	      int n = s.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("@");
			}
			System.out.println(" ");
		}
	}
}
