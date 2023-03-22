package day_6java;
class static_demo
{
	static int a=10;
	static void display()
	{
		System.out.println("STATIC METHOD");
	}
}

public class static_methods {
	public static void main(String args[])
	{
		System.out.println(static_demo.a);
		static_demo.display();
		
	}
 
}
