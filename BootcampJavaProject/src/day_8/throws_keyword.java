package day_8;
class negative_dimension extends Exception{
	public String toString()
	{
		return "Dimensions cannot be 0";
	}
}
public class throws_keyword 
{
	static int area(int l,int b) throws negative_dimension
	{
		if(l<0 || b<0)
		{
			throw new negative_dimension(); //throwing object of class 
		}
		else
		{
			System.out.println("Area is: "+l*b);
		}
		return l*b;

	}
	public static void main(String args[])
	{
		try {
			area(10,5);
		}
		catch(negative_dimension a)
		{
			System.out.println(a);
		}
	}
	

}
