package day_9;
import java.io.*;
public class new_file {

	  public static void main(String args[]) {
	    final String fileName = "C:\\Users\\mksaini\\myjava\\file4.txt";

	    try {
	      File objFile = new File(fileName);
	      if (objFile.createNewFile()) {
	        System.out.println("File created successfully.");
	      } else {
	        System.out.println("File creation failed!!!");
	      }
	    } catch (Exception e) {
	      System.out.println("Exception : " + e);
	    }
	  }
}

