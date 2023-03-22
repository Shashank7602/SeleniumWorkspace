package day4_java;

public class palindrome {

	public static void main(String args[]) {
		int r,sum=0,num1;    
		  int num2=123;
		  
		  num1=num2;    
		  while(num2>0){    
		   r=num2%10;   
		   sum=(sum*10)+r;    
		   num2=num2/10;    
		  }    
		  if(num1==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome"); 
	}
}
