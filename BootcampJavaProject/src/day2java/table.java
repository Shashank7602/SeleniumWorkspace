package day2java;

import java.util.Scanner;

public class table {

	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number: ");
		int num = s.nextInt();
		int i=1;
		while(i<=10)
		{
			System.out.println(num+" * "+i+" = "+num*i);
			i++;
		}
	}
}
