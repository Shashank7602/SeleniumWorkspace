package day_7java;

public class Student {
	String name;
	int roll;

	Student()
	{
		name ="Mandeep";
		roll = 11;
		
	}
	Student(String str,int n)
	{
		name = str;
		roll = n;
	}
	public static void main(String args[])
	{
		Student s = new Student();
		Student s1 = new Student("deep",113);
		System.out.println(s.name);
		System.out.println(s.roll);
		System.out.println(s1.name);
		System.out.println(s1.roll);
		
	}
}

