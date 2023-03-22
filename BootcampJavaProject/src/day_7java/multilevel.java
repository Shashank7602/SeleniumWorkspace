package day_7java;

class A1111
{
	int a = 10;
	void display()
	{
		System.out.println("A");
	}
	
}
class B1111 extends A1111
{
	int b = 20;
	void show()
	{
		System.out.println("B");
	}
}
class C1111 extends B1111
{
	int c = 30;
	void print1()
	{
		System.out.println("C");
	}
}
public class multilevel {
	public static void main(String args[])
	{
		C1111 obj = new C1111();
		obj.print1();
		obj.display();
		obj.show();
	}
	
	
}
