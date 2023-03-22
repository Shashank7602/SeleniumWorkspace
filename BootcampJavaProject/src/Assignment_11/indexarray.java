package Assignment_11;

public class indexarray {
	public static void main(String args[]) {
		int numbers[] = {1,2,3,4,5}; 
	    int element = 2;
	    int index = -1;
	     
	    for(int i = 0; i < numbers.length; i++) {
	        if(numbers[i] == element) {
	            index = i;
	            break;
	        }
	    }
	     
	    System.out.println("Index of "+element+" is : "+index);
		
	}

	
}


