package generics_;

public class generic_demo1<T> {
	T data[] = (T[]) new Object[3];

	public static void main(String args[])
	{
		generic_demo1<String> gd = new generic_demo1();
		gd.data[0] = "hello";
		gd.data[1] = "byeee";
		//gd.data[2] = new Integer[10];
		for(int i=0;i<=3;i++)
		{
			String str = gd.data[i];
			System.out.println(str);
		}
	}
}

