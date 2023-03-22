package day_9;
import java.io.*;
public class copy_file {
	public static void main(String arg[]) throws Exception {  
		  FileReader f1 = new FileReader("C:\\Users\\mksaini\\myjava\\file2.txt");  
		  FileWriter f2 = new FileWriter("C:\\Users\\mksaini\\myjava\\file5.txt", true);  
		  int c;  
		  while ((c = f1.read()) != -1) {  
		   f2.write(c);  
		  }  
		  System.out.println("Copy finished...");  
		  f1.close();  
		  f2.close();  
		 }  
}


