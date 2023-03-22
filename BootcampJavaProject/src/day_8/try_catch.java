package day_8;

public class try_catch {

	public static void main(String args[]) throws Exception
	{
		int a = 10;
		int b = 2;
		try
		{
			int c = a/b;
			System.out.println(c);
			try
			{
				int A[]=null;
				System.out.println(A.length);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		
		catch(ArithmeticException e)
		{
			throw e;
		}
		
	}
	
}

