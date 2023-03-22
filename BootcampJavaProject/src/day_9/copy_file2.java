package day_9;

import java.io.*;
//import java.io.FileWriter;

public class copy_file2 {
	public static void main(String arg[]) throws Exception {
		  byte[] b = new byte[30];
		  FileInputStream f1 = new FileInputStream("C:\\Users\\mksaini\\myjava\\file2.txt");  
		  FileOutputStream f2 = new FileOutputStream("C:\\Users\\mksaini\\myjava\\file5.txt");  
		  f1.read(b);
		  f2.write(b);
		  f1.close();
		  f2.close();
}
}
