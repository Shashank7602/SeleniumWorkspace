package Assignment_11;
import java.util.*;
public class removeelment {
	public static void main(String[] args) {
        int arr[] = new int[]{10,20,30,40,50};
        int arr_new[] = new int[arr.length-1];
        int remove_element=30;
        for(int i=0, k=0;i<arr.length;i++){
            if(arr[i]!=remove_element){
                arr_new[k]=arr[i];
                k++;
            }
        }
        System.out.println("Array before" + Arrays.toString(arr));
        System.out.println("After deletion :" + Arrays.toString(arr_new));

	
}
}