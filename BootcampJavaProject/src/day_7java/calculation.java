package day_7java;

public class calculation {
	static int sum(int x ,int y)
	{
		int Sum1;
		Sum1=x+y;
		return Sum1;
	}
	static int sum(int x ,int y,int z)
	{
		int Sum2;
		Sum2=x+y+z;
		return Sum2;
	}
	static double sum(double x ,double y)
	{
		double Sum3;
		Sum3=x+y;
		return Sum3;
	}
	static double sum(double x ,double y,double z)
	{
		double Sum3;
		Sum3=x+y+z;
		return Sum3;
	}

	public static void main(String args[])
	{
		System.out.println("sum1:"+sum(10,12));
		System.out.println("sum2:"+sum(10,12,23));
		System.out.println("sum3:"+sum(10.2,12.5));
		System.out.println("sum4:"+sum(10.8,12.3,12.5));
	}
}
