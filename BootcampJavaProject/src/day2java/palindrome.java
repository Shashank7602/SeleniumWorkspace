package day2java;

import java.util.Scanner;

public class palindrome {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number: ");
		int num = s.nextInt();
		int num1=num/100;
		int num2=(num%100)/10;
		int num3=(num%10)/100;
		int reverse;
		reverse=(num3*100)+(num2*10);
		System.out.println("Reverse is:"+reverse);
	}

}
