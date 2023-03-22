package Day1Java;

import java.util.Scanner;

public class oddnumbers {

	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter first number: ");
		int m = s.nextInt();
		
		System.out.println("enter second number: ");
		int n = s.nextInt();
		for(int i=m;i<=n;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
    }
}}
