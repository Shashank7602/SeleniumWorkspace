package assignment13;
import java.util.Scanner;
public class student {
	String stu_name;
	int pun_marks;
	int maths_marks;
	int sci_marks;
	double total_marks;
	double percent;
	    
	    public void inputmarks() {
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter the name of student : ");
	        stu_name = s.nextLine();
	        System.out.print("Enter marks in punjabi: ");
	        pun_marks = s.nextInt();
	        System.out.print("Enter marks in maths: ");
	        maths_marks= s.nextInt();
	        System.out.print("Enter marks in science: ");
	        sci_marks= s.nextInt();
	    }
	    
	    public void calculatemarks() {
	        total_marks = pun_marks + maths_marks + sci_marks;
	    }
	    
	    public void displaymarks() {
	        System.out.println("Name of student: " + stu_name );
	        System.out.println("Marks in Punjabi: " + pun_marks);
	        System.out.println("Marks in Maths: " + maths_marks);
	        System.out.println("Marks in Science: " + sci_marks);
	        System.out.println("Total Marks: " + total_marks);
	    }
	    
	    public static void main(String args[]) {
	        student obj = new student();
	        obj.inputmarks();
	        obj.calculatemarks();
	        obj.displaymarks();
	    }
}

