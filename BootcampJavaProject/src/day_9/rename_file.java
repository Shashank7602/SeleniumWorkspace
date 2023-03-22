package day_9;
import java.io.*;
public class rename_file {
	public static void main(String args[])
	{
		File obj = new File("C:\\Users\\mksaini\\myjava\\file1.txt");
		File obj1 = new File("C:\\Users\\mksaini\\myjava\\file3.txt");
		System.out.println(obj.length());
		System.out.println(obj.getAbsolutePath());
		obj.renameTo(obj1);
	}

}

