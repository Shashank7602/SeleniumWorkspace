package day_8;

public class number_format {
	public static void main(String args[])
	{
		String s = "mandeep";
		try {
			int n = Integer.parseInt(s);
			System.out.println(n);
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}
	}

}
