package Day1Java;
import java.util.Scanner;
public class stringexercise {
	public static void main(String args[])
	{
	    Scanner s=new Scanner(System.in);
	    System.out.print("Enter A String: ");
	    String str=s.nextLine();
	    int letter=0,space=0,digit=0,other=0;
	   char ch[]=str.toCharArray();
	   for(int i=0;i<str.length();i++)
	   {
		   if(Character.isLetter(ch[i]))
		   {
			   letter++;
		   }
		   else if(Character.isDigit(ch[i]))
		   {
			   digit++;
		   }
		   else if(Character.isSpaceChar(ch[i]))
		   {
			   space++;
		   }
		   else
		   {
			   other++;
		   }
	    }
	System.out.println("Letters in string are: "+letter);
	System.out.println("Spaces in string  are: "+space);
	System.out.println("Digits in string are: "+digit);
	System.out.println("Other characters in string are: "+other);      
	}

	}

