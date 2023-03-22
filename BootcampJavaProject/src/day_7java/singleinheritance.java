package day_7java;
	
class parent
{
	int a =5;
	void display()
	{
		System.out.println("parent class");
		
	}
}

class child extends parent 
{
	int b =10;
	void show()
	{
		System.out.println("child class");
	}
}
public class singleinheritance 
{

	public static void main(String args[])
	{
		child obj = new child();
		System.out.println(obj.a);
		obj.display();
		System.out.println(obj.b);
		obj.show();
		}
		}


