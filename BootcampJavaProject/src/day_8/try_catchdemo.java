package day_8;

import java.util.Scanner;

public class try_catchdemo {
	//public void getMessage()
	//{
		//System.out.println("denominator be not 0");
	//}

	public static void main(String args[]) {
		//try_catchdemo obj = new try_catchdemo();
		Scanner s = new Scanner(System.in);
	      System.out.print("Enter first number: ");
	      int num = s.nextInt();
	      System.out.print("Enter second number: ");
	      int num1 = s.nextInt();
	      try
			{
				int c = num/num1;
				System.out.println(c);
			}
			catch(ArithmeticException a)
			{
				System.out.println("Denominator should be greater than 0");
				System.out.println(a.getMessage());
				System.out.println(a.toString()); //or when we write simple e 
				a.printStackTrace();
			}
	}
}

