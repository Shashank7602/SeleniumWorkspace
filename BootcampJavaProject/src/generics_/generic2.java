package generics_;

class data<M>
{
	private M obj;
	public void setData(M a)
	{
		obj = a;
	}
	public M getData()
	{
		return obj;
	}
}
public class generic2 {

	public static void main(String args[])
	{
		data<Integer> d = new data<>();
		d.setData(20);
		System.out.println(d.getData());
		
		data<Double> d1 = new data<>();
		d1.setData(20.11);
		System.out.println(d1.getData());
		data<String> d2 = new data<>();
		d2.setData("hello mandeep here");
		System.out.println(d2.getData());
	}
	
}
