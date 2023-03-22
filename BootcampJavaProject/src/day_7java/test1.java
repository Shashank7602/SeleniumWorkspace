package day_7java;
abstract class A121 {
//abstract void m1();
void m2(){
 System.out.println("One");
 }
}
class B121 extends A121{
	void m2()
	{
		System.out.println("Two");
	}
}
public class test1 {

	public static void main(String args[])
{
		B121 obj = new B121();
		obj.m2(); //calling m2 method by extending the abstract class and creating object of the sub class
        A121 obj2 = new B121();
        obj2.m2();
}
	
}
