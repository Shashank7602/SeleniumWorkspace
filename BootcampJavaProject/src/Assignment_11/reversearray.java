package Assignment_11;
import java.util.Scanner;
public class reversearray {

	public static void main(String args[]) 
    {
        int n,j=0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        n = s.nextInt();
        int array[] = new int[n];
        int rev[] = new int[n];
        System.out.println("Enter "+n+" elements ");
        for(int i=0; i < n; i++)
        {
            array[i] = s.nextInt();
        }
        System.out.println("Reverse of an array is :");
        for(int i=n;i>0 ; i--,j++)
        {
            rev[j] = array[i-1];
            System.out.println(rev[j]);
    
        }
    }
}
