package day_7java;
class Main {
	public void display() {
		 for (int i = 0; i < 10; i++) {
		 System.out.print("*");
		 }
		 }
		 // method with single parameter
		 public void display(char symbol) {
		 for (int i = 0; i < 10; i++) {
		 System.out.print(symbol);
		 }
		 }
	}
	
public class ques17 {
	public static void main(String[] args) {
		Main d1 = new Main();
		 // call method without any argument
		d1.display();
		System.out.println("\n");
		 // call method with a single argument
		d1.display('#');
		 }
}

		 


