package Day1Java;

import java.util.Scanner;

public class powerofno {

	public static void main(String[] args) {

	    int base, power;
	    Scanner s = new Scanner(System.in);
		System.out.println("enter base number: ");
		base = s.nextInt();
		
		System.out.println("enter power of base number: ");
		power = s.nextInt();

	    int result = 1;

	    for (int i=power; i>0; i--) {
	      result *= base;
	    }

	    System.out.println(base+" power "+power+" is "+result);
	  }
}
