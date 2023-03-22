package day_7java;

class parent3
{
	public void display()
	{
		System.out.println("hello there");
	}
}
class child3 extends parent3
{
	public void display()
	{
		super.display();
		System.out.println("hello welcome");
	}
}
public class dmd {

	public static void main(String args[])
	{
		parent3 obj =  new child3(); 
		
		obj.display();
		
	}
}
