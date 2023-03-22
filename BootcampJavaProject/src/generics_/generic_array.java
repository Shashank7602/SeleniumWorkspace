package generics_;

class MyArray<T1>
{
	T1 A[] = (T1[]) new Object[3];
	int length = 0;
	public void append(T1 v)
	{
		A[length++] = v;
	}
	public void display()
	{
		for(int i=0;i<length;i++)
		{
			System.out.println(A[i]);
		}
	}
	
}
public class generic_array {

	public static void main(String args[])
	{
		MyArray<Integer> d = new MyArray<>();
		d.append(10);
		d.append(20);
		d.append(30);
		d.display();
		
		MyArray<String> d1 = new MyArray<>();
		d1.append("Hello");
		d1.append("Mandeep");
		d1.append("Byee");
		d1.display();

	}
}
