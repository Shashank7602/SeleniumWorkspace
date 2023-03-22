package day_7java;
class parent2
{
	public void display()
	{
		System.out.println("Method 1");
	}
}
class child2 extends parent2
{
	public void display()
	{
		super.display();
		System.out.println("Method 2");
	}
}
public class overriding {
	public static void main(String args[])
	{
		child2 obj = new child2();
		obj.display();
	}
	
}

