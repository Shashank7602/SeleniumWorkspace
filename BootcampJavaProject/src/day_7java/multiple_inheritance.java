package day_7java;

interface A3
{
	public void Adisplay();
}
interface B3
{
	public void Bdisplay();
}
class AB implements A3,B3
{
	public void Adisplay()
	{
		System.out.println("A method");
	}
	public void Bdisplay()
	{
		System.out.println("B method");
	}
}
public class multiple_inheritance {

	public static void main(String args[])
	{
		AB obj = new AB();
		obj.Adisplay();
		obj.Bdisplay();
	}
}
