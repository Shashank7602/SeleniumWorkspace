package day_9;
import java.io.*;
public class buffer_writer {

	public static void main(String args[]) throws Exception
	{
		FileWriter obj = new FileWriter("C:\\Users\\mksaini\\myjava\\file2.txt");
		BufferedWriter f = new BufferedWriter(obj);
		f.write("mandeep here");
		//obj.write("Hi this is bebo technologies");
		f.close();
	}
}
