package day_9;

import java.io.*;

public class input_stream {
	public static void main(String args[])
	{
		try {
			FileInputStream fs = new FileInputStream("C:\\Users\\mksaini\\myjava\\file2.txt");
			byte[] b = new byte[fs.available()];
			fs.read(b);
			String str = new String(b);
			System.out.println(str);
			fs.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}

}
