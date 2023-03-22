package day_8;

public class nested_try {

	public static void main(String args[])
	{
		int a = 10;
		int b = 2;
		try
		{
			int c = a/b;
			System.out.println(c);
		try
		{
			int A[]= {1,2,3,4,5};
			System.out.println(A[10]);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
	}
}
