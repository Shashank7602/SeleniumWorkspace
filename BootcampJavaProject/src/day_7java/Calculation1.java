package day_7java;

public class Calculation1 {
	int a,b,c;
	Calculation1(int x,int y,int z)
	{
		a=x;
		b=y;
		c=z;
	}
	 public int sum()
	{
		int sum;
		sum=a+b+c;
		return sum;
	}
	 public static void main(String args[])
		{
			
		Calculation1 obj = new Calculation1(10,20,30);
		System.out.println("sum: "+obj.sum());
	}

}