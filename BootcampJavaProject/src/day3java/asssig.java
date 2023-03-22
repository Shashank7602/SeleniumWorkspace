package day3java;
import java.util.Scanner;
public class asssig {

		public static void main(String args[] ) 
		{
			Scanner s=new Scanner(System.in);
			System.out.println("enter first number: ");
			int num1 = s.nextInt();
			System.out.println("enter second number: ");
			int num2 = s.nextInt();
			if(num1==num2)
			{
				System.out.println(num1+" == "+num2);
			}
			if(num1!=num2)
			{
				System.out.println(num1+" != "+num2);
			}
			if(num1<num2)
			{
				System.out.println(num1+" < "+num2);
			}
			if(num1>num2)
			{
				System.out.println(num1+" > "+num2);
			}
			if(num1<=num2)
			{
				System.out.println(num1+" <= "+num2);
			}
			if(num1>=num2)
			{
				System.out.println(num1+" >= "+num2);
			}
		}
			
			
		}

