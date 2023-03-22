package day3java;
import java.util.Scanner;
public class sumdouble {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the first number: ");
	int a = s.nextInt();
	System.out.println("enter the second number: ");
	int b = s.nextInt();
	if(a!=b)
	{
		System.out.println(a+b);
	}
	else
	{
		System.out.println(2*(a+b));
	}
	
	}

}
