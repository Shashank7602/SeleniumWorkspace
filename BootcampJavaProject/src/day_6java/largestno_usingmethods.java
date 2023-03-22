package day_6java;
class demo3{
	int max(int x,int y)
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
}

public class largestno_usingmethods {
	

	public static void main(String args[])
	{
		demo3 ob = new demo3();
		System.out.println(ob.max(12,15));
	}
}
