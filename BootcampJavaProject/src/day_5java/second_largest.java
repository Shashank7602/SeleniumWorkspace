package day_5java;

import java.util.Scanner;

public class second_largest {
	public static void main(String args[])
	{
		int A[]=new int[5];
		Scanner s = new Scanner(System.in);
		System.out.println("enter the values of array: ");
		for(int i=0;i<A.length;i++)
		{
			A[i]=s.nextInt(); //reading the values
		}
		int max1=A[0];
		int max2=A[0];
		for(int i=0;i<A.length;i++)
		{
		
			if(A[i]>max1)
			{ 
				max2=max1;
				max1=A[i];
			}
			else if(A[i]>max2)
			{
				max2=A[i];
			}
		}
		System.out.println("largest no. is:"+max1);
		System.out.println(" 2nd largest no. is:"+max2);
	}

}
