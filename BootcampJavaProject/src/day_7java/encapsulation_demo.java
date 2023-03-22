package day_7java;
class Encap
{
	int a = 10;
	int b = 20;
	public void show()
	{
		System.out.println(a);
		System.out.println(b);
	}
}
// wrapping the variables and method of a class in another class 
public class encapsulation_demo {

	public static void main(String args[])
	{
		Encap obj = new Encap();
		obj.show();
	}
	
}
