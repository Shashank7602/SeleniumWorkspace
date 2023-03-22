package day_7java;
interface A5
{
	int a = 10;
	int b = 20;
	public int add();
}
interface B5
{
	int x = 5;
	int y = 6;
	public int mul();
}
class AB5 implements A5,B5
{
	public int add() {
		int sum = a + b;
		return sum;
	}
	public int mul()
	{
		int mul = x*y;
		return mul;
	}
}
public class multiple_inheritance1 {

	public static void main(String args[])
	{
		AB5 obj = new AB5();
		System.out.println("sum: "+obj.add());
		System.out.println("multiplication: "+obj.mul());
	}
}
