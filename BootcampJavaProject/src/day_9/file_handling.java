package day_9;
import java.io.*;
public class file_handling {

	public static void main(String args[])
	{
		try {
			FileOutputStream fs = new FileOutputStream("C://Users//mksaini//myjava//file1.txt");
			String str ="welcome to file handling";
			fs.write(str.getBytes());
			byte[] b = str.getBytes();
			fs.write(b,8,str.length()-8); //offset
			//for(byte x:b)
				
			fs.close();
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}
