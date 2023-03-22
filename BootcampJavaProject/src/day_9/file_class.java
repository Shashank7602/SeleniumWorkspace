package day_9;
import java.io.*;
public class file_class {

	public static void main(String args[])
	{
		File f = new File("C://Users//mksaini//myjava");
		System.out.println(f.isDirectory());
		File list[] = f.listFiles();
		for(File x:list)
		{
			System.out.println(x);
			System.out.println(x.getName() + "");
			System.out.println(x.getPath());
		}
	}
}
