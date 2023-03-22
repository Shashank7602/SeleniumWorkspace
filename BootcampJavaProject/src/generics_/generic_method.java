package generics_;

public class generic_method {

	static <T> void Show(T[] list)
	{
		for(T x: list) {
			System.out.println(x);
		}
	}
	public static void  main(String args[])
	{
		Show(new String[] {"hi","hello","byeee"});
		Show(new Integer[] {10,20,30});
		Show(new Double[] {10.1,20.5,30.11});
	}
}
