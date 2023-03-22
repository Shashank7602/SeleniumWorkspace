package day_8;
class parent
{
	static void parent_method()
	{
		System.out.println("method of parent class");
	}
}
class child extends parent
{
	static void child_method()
	{
		System.out.println("method of child class");
	}
}
public class ques8 {
	public static void main(String args[])
	{
		parent obj1 = new parent();
		child obj2 = new child();
		obj1.parent_method();
		obj2.child_method();
		obj2.parent_method();
	}

}
