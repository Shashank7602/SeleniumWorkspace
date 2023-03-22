package Day1Java;
import java.util.Scanner;
public class primenumber {
	public static void main(String[] args) 
	{
	      Scanner s = new Scanner(System.in);
	      System.out.print("Enter the number: ");
	      int num = s.nextInt();
	      boolean isprime = false;
	      for (int i = 2; i <= num / 2; ++i) {
	         if (num % i == 0) {
	            isprime = true;
	            break;
	         }
	      }
	      if (!isprime)
	         System.out.println(num + " is a prime number.");
	      else
	         System.out.println(num + " is not a prime number.");
	   }

}
