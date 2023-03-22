package day_6java;

public class Method_overloading {

	static int max(int x,int y)
	{
		if(x>y)
		{
			return x;
		}
		else
		{
			return y;
		}
	}
	static float max(float x,float y)
	{
		if(x>y)
		{
			return x;
		}
		else
		{
			return y;
		}
	}
	public static void main(String args[])
	{
		System.out.println(max(12,11));
		System.out.println (max(7.0f,9.5f));
		}
}
