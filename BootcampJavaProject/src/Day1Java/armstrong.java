package Day1Java;

import java.util.Scanner;
import java.lang.Math;

public class armstrong {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    System.out.print("Enter the number: ");
	    int num = s.nextInt();
	    int number, r, result = 0;
	    number = num;

        while (number != 0)
        {
            r = number % 10;
            result += Math.pow(r, 3);
            number /= 10;
        }

        if(result == num)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
    }
}
