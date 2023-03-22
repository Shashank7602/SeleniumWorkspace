package day3java;

import java.util.Scanner;

public class parrot_trouble {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter hours from 0 to 23: ");
		int hour = s.nextInt();
		boolean talking = true;
		if(talking==true && hour<7||hour>20)
		{
			System.out.println("true");
			
		}
		else
		{
			System.out.println("false");
		}
	}

}
