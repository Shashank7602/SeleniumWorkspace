package day_7java;

interface A2
{
	public void meth1();
	public void meth2();
	static public void meth4()
	{
		System.out.println("method 4");
	}
	private  void meth5()
	{
		System.out.println("method 5");
	}
	
}
class B2 implements A2
{
	public void meth1()
	{
		System.out.println("method 1");
	}
	public void meth2()
	{
		System.out.println("method 2");
	}
	public void meth3()
	{
		System.out.println("method 3");
	}
}
public class interfaces_demo {

	public static void main(String args[])
	{
		B2 obj = new B2();
		obj.meth1();
		obj.meth2();
		obj.meth3();
		A2.meth4();
		//A2.meth5();//not accessible only used for definition 
		
	}
}
