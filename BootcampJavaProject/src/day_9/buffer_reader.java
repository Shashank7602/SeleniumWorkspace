package day_9;
import java.io.*;
public class buffer_reader {

	public static void main(String args[]) throws Exception
	{
		FileReader obj = new FileReader("C:\\Users\\mksaini\\myjava\\file2.txt");
		BufferedReader f = new BufferedReader(obj);
		 String str = f.readLine();    
		System.out.println(str);
		f.close();
}
}
