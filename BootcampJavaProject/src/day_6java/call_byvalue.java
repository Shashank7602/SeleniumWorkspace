package day_6java;

public class call_byvalue {

	static void inc(int x) //formal parameter at definition
	{
		x++;
		System.out.println(x);
		
	}
	public static void main(String args[])
	{
		int a=10;
		inc(a); // actual parameter at declaration
		System.out.println(a);
	}
}
