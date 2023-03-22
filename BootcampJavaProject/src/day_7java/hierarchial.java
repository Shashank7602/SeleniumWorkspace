package day_7java;

class A
{
	int a = 10;
	void display()
	{
		System.out.println("A");
	}
	
}
class B extends A
{
	int b = 20;
	void show()
	{
		System.out.println("B");
	}
}
class C extends A
{
	int c = 30;
	void print1()
	{
		System.out.println("C");
	}
}
public class hierarchial {
	public static void main(String args[])
	{
		C obj1 = new C();
		obj1.print1();
		obj1.display();
		B obj2 = new B();
		obj2.display();
		obj2.show();
	}
}
