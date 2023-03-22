package day3java;

import java.util.Scanner;

public class diff_21 {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter value of n: ");
		int n = s.nextInt();
		if(n<=21)
		{
			System.out.println(21-n);
		}
		else
		{
			System.out.println(2*(n-21));
		}
	}
}
