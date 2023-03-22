package Assignment_11;
import java.util.Arrays;
public class copyarray {
	public static void main(String[] args) {
		   int array1[] = {10,20,30,40,50};
		   int array2[] = new int[5];

		   System.out.println("1st Array : "+Arrays.toString(array1));

		   for(int i=0; i < array1.length; i++) {
		    array2[i] = array1[i];
		}
		   System.out.println("2nd Array: "+Arrays.toString(array2));
		 }

}
