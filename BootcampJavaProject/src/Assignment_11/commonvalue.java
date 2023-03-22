package Assignment_11;
public class commonvalue {

	public static void main(String[] args) 
    {
      String array1[] = {"mandeep","deep","akash"};
      String array2[] = {"akash","jyoti","pooja"};

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

