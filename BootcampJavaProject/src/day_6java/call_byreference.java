package day_6java;

public class call_byreference {

	static  void update(int A[]) // formal
	{
		A[0]=25;
	}
	public static void main(String args[])
	{
		int A[]= {1,2,3,4};
		update(A); // actual 
		System.out.println(A[0]);
	}
}
