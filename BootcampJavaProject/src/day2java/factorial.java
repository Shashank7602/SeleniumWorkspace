package day2java;

import java.util.Scanner;

public class factorial {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number: ");
		int num = s.nextInt();
		int fact = 1;
		int i =1;
		while(i<=num)
		{
			fact=fact*i;
			i++;
		}
		System.out.println("Factorial is: "+fact);
	}

}
