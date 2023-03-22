package package1;
class Acc
{
	int a = 10;
	private int b = 20;
	protected int c = 30;
	public int d = 40;
	void show() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
}
}
class B13
{
	int a = 10;
	private int b = 20;
	protected int c = 30;
	public int d = 40;
	void show2() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
}
}


class BB extends Acc
{
	void show1() {
		System.out.println(a);
	//	System.out.println(b);
		System.out.println(c);
		System.out.println(d);
			
		}
	}
public class accessibility1 {
	public static void main(String args[])
	{
		Acc obj = new Acc(); 
		obj.show();
		B13 obj2 = new B13();
		obj2.show2();
		BB obj1 = new BB();
		obj1.show1();
		
		
		
	}
}

