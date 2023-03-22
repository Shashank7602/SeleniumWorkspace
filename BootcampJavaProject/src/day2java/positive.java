package day2java;

import java.util.Scanner;

public class positive {

	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number: ");
		int num = s.nextInt();
		if(num>0)
		{
			System.out.println("Number is positive");
		}
		else if(num<0)
		{
			System.out.println("Number is negative");
		}
		else 
		{
			System.out.println("Number is Zero");
		}
	}
}
