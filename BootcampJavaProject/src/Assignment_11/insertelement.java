package Assignment_11;
import java.util.*;
public class insertelement {

	public static void main(String[] args) {   
		int arr[] = {1,2,3,4,5,6};  
		int n = arr.length;  
		int my_array[] = new int[n+1];  
		int value = 7;  
		System.out.println(Arrays.toString(arr));  
		for(int i = 0; i<arr.length; i++) {  
		my_array[i] = arr[i];  
		}  
		my_array[n] = value;  
		System.out.println(Arrays.toString(my_array));  
		}  
}

