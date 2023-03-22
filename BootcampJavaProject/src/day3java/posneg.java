package day3java;

public class posneg {
	public static void main(String args[])
	{
		int a = 10;
		int b = -5;
		boolean negative = false;
		if(a>0 && b<0 && negative==false)
		{
			System.out.println("true");
		}
		else if(a<0 && b>0 && negative==false)
		{
			System.out.println("true");
		}
		else if(negative==true && a<0 && b<0)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}

}
