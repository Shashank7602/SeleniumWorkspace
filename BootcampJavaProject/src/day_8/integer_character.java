package day_8;

public class integer_character {
	static void method(int i ,char c)
	{
		System.out.println(i);
	}
	static void method(char c,int i)
	{
		System.out.println(c);
	}
	public static void main(String args[])
	{
		integer_character obj = new integer_character();
		obj.method(11,'M');
		obj.method('A', 2);
	}
	
	

}
