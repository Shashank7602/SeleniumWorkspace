package day_7java;
class A11
{
	public void display()
	{
		System.out.println("class A");
	}
}
interface B11
{
	public void show1();
}
interface B12
{
	public void show2();
}
class c11 extends A11 implements B11,B12
{
	public void show1()
	{
		System.out.println("class B11");
	}
	public void show2() {
		System.out.println("class B12");
	}
}
public class hybrid_inheritance {

	public static void main(String args[])
	{
		c11 obj = new c11();
		obj.display();
		obj.show1();
		obj.show2();
	}
	
}
