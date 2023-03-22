package Day1Java;
import java.util.Scanner;
public class strongnumber {
		public static void main(String[] args) {
			{
				int num, sum=0;  
				Scanner sc=new Scanner(System.in);         
				System.out.print("Enter any number: ");  
				num=sc.nextInt();  
				int i=1;  
				while(i <= num/2)  
				{  
					if(num % i == 0)  
					{  
						sum = sum + i;  
					} 
					i++;  
				} 
				if(sum==num)  
				{  
					System.out.println("Number "+num+" is a perfect number.");  
				}  
				else 
				{
					System.out.println("Number "+num+" is not a perfect number.");   
				}

			}  
			}
}

