package Assignment_11;

public class duplicate_elemnt {

	public static void main(String[] args) {      
        
        String my_arr[] = new String [] {"mandeep","deep","akash","deep"};   
          
        System.out.println("Duplicate elements in given array: ");   
        for(int i = 0; i < my_arr.length; i++) {  
            for(int j = i + 1; j < my_arr.length; j++) {  
                if(my_arr[i] == my_arr[j])  
                    System.out.println(my_arr[j]);  
            }  
        }  
    }  
}
