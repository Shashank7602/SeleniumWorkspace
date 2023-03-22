package day_6java;
//static block is not executed in this code
class staticdemo
{
	static int a=10;
	static void display()
	{
		System.out.println("STATIC METHOD");
	}
	static 
	{
		System.out.println("STATIC BLOCK");
	}
}
public class satic_block1 {

	public static void main(String args[])
	{
		//by writing this static_demo.variable or method then by default static block is executed
		System.out.println(staticdemo.a);
		staticdemo.display();
		System.out.println("Main method");
		
	}
	
}


