package day_9;

import java.io.*;
public class throwsfile_handling {

	public static void main(String args[]) throws Exception
	{
			FileInputStream fs = new FileInputStream("C:\\Users\\mksaini\\myjava\\file10.txt");
			byte[] b = new byte[fs.available()];
			fs.read(b);
			String str = new String(b);
			System.out.println(str);
			fs.close();
	}
}
