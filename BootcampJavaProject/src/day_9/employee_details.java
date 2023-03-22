package day_9;

import java.util.Scanner;

public class employee_details {

	static String name;
	static double salary;
	static String date;
	
	public static void main(String args[])
	{
		employee_details obj[]=new employee_details[3];
		Scanner s = new Scanner(System.in);
		
		for(int i=0;i<=2;i++)
		{
			System.out.println("enter name: ");	
			obj[i].name = s.next();
			System.out.println("enter salary: ");	
			obj[i].salary = s.nextDouble();
			System.out.println("enter date of joining: ");	
			obj[i].name = s.next();
			
		}
		System.out.println("Employee Details: ");
		for(int i=0;i<=2;i++)
		{
			
			System.out.println("name of employee:"+obj[i].name);
			System.out.println("salary of employee:"+obj[i].salary);
			System.out.println("date of joining:"+obj[i].date);
			System.out.println(" ");
		}
}
}