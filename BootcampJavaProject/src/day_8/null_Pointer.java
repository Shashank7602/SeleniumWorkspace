package day_8;
//int a[]= null a.length
// String s = "abc";
//int = integer.parseint(s);
public class null_Pointer
{
	public static void main(String args[])
	{
		int a[] = null;
		try {
			System.out.println(a.length);
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("finally block");
		}
	}
	

}

