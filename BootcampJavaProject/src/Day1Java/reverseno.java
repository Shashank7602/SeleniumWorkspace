package Day1Java;

public class reverseno {

	public static void main(String[] args)   
	{  
	int num = 1234, r=0;  
	while(num != 0)   
	{  
	int reverse = num % 10;  
	reverse = (reverse * 10) + r;  
	num = num/10;  
	}  
	//System.out.println("The reverse of the given number is: " +reverse);  
	}  
}
