package generics_;
class DemoClass
{
	public <T> void genericsMethod(T data)
	{
		System.out.println("generic method: ");
		System.out.println("data passed: "+data);
		
	}
}
public class generic_class {

	public static void main(String args[])
	{
		DemoClass obj = new DemoClass();
		obj.<String>genericsMethod("java generics programming");
		obj.<Integer>genericsMethod(1102);
		
	}
}

