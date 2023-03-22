package day_7java;

abstract class shape
{
	abstract public double parameter();
	abstract public double area();
	
}
class circle extends shape
{
	double r=5;
	public double parameter()
	{
		return 2*3.14*r;
	}
	public double area()
	{
		return 3.14*r*r;
	}
}
class rectangle extends shape
{
	double l=10;
	double b=20;
	public double parameter()
	{
		return 2*(l+b);
	}
	public double area()
	{
		return l*b;
	}
}
public class abstract_1 {

	public static void main(String args[])
	{
		rectangle r = new rectangle();
		shape s1 = new circle();
		System.out.println("parameter rectangle: "+r.parameter());
		System.out.println("rectangle area: "+r.area());
		System.out.println("circle parameter: "+s1.parameter());
		System.out.println("circle area: "+s1.area());
		
		
	}
	
}
