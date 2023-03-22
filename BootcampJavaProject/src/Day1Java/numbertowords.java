package Day1Java;
import java.util.Scanner;
public class numbertowords {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the two digit number: ");
		int num=sc.nextInt();
		int n1=num,n2=num;
		int n3=n1%10,n4=n2/10; 
		String ones[] = new String[]{"zero","one","two","three","four","five", "six","seven","eight","nine"};
		String tens[] = new String[]{"","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen", "nineteen"};
		String hundreds[] = new String[]{"","","twenty","thirty","forty","fifty","sixty", "seventy","eighty","ninety"};
		if(num==0)
		{
			System.out.println("Zero");
		}
		else if(n4==1)
		{
			System.out.println(tens[n3+1]);
		}
		else if(n3==0)
		{
			System.out.println(hundreds[n4]);
		}
		else
		{
			System.out.println(hundreds[n4]+" "+ones[n3]);
		}
	}

}
