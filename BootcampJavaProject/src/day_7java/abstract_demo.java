package day_7java;

abstract class A1
{
	abstract void display();
}
abstract class B1 extends A1
{
	void display()
	{
		System.out.println("class A");
	}
	abstract void show();
}
class C1 extends B1
{
	void show()
	{
		System.out.println("class B");
	}
}
public class abstract_demo {

	public static void main(String args[]) {
		C1 obj = new C1();
		obj.show();
		obj.display();
	}
}
