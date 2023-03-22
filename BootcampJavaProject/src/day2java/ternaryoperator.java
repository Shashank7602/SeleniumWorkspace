package day2java;
import java.util.Scanner;
public class ternaryoperator {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your age: ");
		double age = s.nextDouble();
		String Vote = (age>18)?"Elligible":"Not Eligible ";
		System.out.println("You are "+Vote+" to vote");
		}

}
