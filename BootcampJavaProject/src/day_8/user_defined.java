package day_8;

import java.util.Scanner;

class own_exception extends Exception
{
	public String toString()
	{
		return "balance should not be less than 5000";
	}
	
}
public class user_defined { // also called as custom Exception
	static void fun1()
	{
		try
		{
			throw new own_exception();
		}
		catch(own_exception a)
		{
			System.out.println(a);
		}
	}
	static void fun2()
	{
		fun1();
	}
	static void fun3()
	{
		fun2();
	}
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
	    System.out.print("Enter balance: ");
	    int balance = s.nextInt();
		if(balance<5000)
		{
			fun3();	
		}
		else
		{
			System.out.println("your balance is: "+balance);
		}
	}
}

