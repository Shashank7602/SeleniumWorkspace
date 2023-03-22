package day_7java;
class parent1
{
	parent1()
	{
		System.out.println("non param parent class constructor");
	}
	String str;
	parent1(String s)
	{
		str =s;
		System.out.println(str);
	}
}
class child1 extends parent1
{
	child1()
	{
		System.out.println("non param parent class constructor");
	}
	String str1;
	child1(String s)
	{
		str =s;
		System.out.println(str);
	}
}
public class constructorinheritance {
	public static void  main(String args[])
	{
		child1 obj = new child1("child class constructor");
		
	}
}
