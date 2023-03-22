package day2java;

public class Incrementoperators {
	public static void main(String args[])
	{
		int x=10;
		int y=x++;
		System.out.println("value of x: "+x);
		System.out.println("value of y: "+y);
		
		y=++x;
		System.out.println("value of x: "+x);
		System.out.println("value of y: "+y);
		
		y=x--;
		System.out.println("value of x: "+x);
		System.out.println("value of y: "+y);
		
		y=--x;
		System.out.println("value of x: "+x);
		System.out.println("value of y: "+y);
		
	}
	
	

}
