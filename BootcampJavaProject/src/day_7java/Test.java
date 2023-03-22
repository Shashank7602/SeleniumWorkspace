package day_7java;

abstract class A111 {
	abstract void m1();
	}
class B111 extends A111 {
	void m1(){
	 System.out.println("m1 in class B");
	 }
	}
public class Test {
	public static void main(String[] args) {
		B111 b = new B111();
		b.m1();
		 }
}

