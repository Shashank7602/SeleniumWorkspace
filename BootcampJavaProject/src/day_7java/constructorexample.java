package day_7java;

public class constructorexample {
	String str;
	constructorexample()
	{
		System.out.println("constructor of class A");
	}
	constructorexample(String s)
	{
		str=s;
		System.out.println(s);
	}

	public static void main(String args[])
	{
		constructorexample ob = new constructorexample();
		constructorexample ob1 = new constructorexample("this is a parameterized constructor");
		
		
	}
	
}

