package day2java;
import java.util.Scanner;

public class student_grade {

	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the marks: ");
		int marks = s.nextInt();
		if(marks>95)
		{
			System.out.println("You got Grade A");
		}
		else if(marks>90)
		{
			System.out.println("You got Grade B");
		}
		else if(marks>85)
		{
			System.out.println("You got Grade C");
		}
		else 
		{
			System.out.println("you got Grade D");
		}
	}
}
