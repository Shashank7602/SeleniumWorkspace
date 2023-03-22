package Assignment_11;
import java.util.*;
public class commomintegers {

	public static void main(String[] args) 
    {
      int[] array1 = {10,20,30,40,50};
      int[] array2 = {60,70,80,10,90};
 
       System.out.println("Array1 : "+Arrays.toString(array1));
       System.out.println("Array2 : "+Arrays.toString(array2));
 
      
        for (int i = 0; i < array1.length; i++)
        {
            for (int j = 0; j < array2.length; j++)
            {
                if(array1[i] == (array2[j]))
                {
                 
                 System.out.println("Common element is : "+(array1[i]));
                 }
            }
        }
}
}
