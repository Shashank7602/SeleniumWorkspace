package Day1Java;

import java.util.Scanner;

public class floydtriangle {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("input the no. of rows: ");
		int m = s.nextInt();
		int a=1;
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(a+" ");
				a++;
			}
			System.out.println(" ");
		}
	}

}
