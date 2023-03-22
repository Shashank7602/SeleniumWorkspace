package generics_;

public class generics_demo {

	public static void main(String args[])
	{
		Object obj[] = new Object[3];
		obj[0] = "hello";
		obj[1] = "byee";
		obj[2] = new Integer[10];
		String str;
		for(int i=0;i<=3;i++)
		{
			str = (String)obj[i];
			System.out.println(str);
		}
	}
}