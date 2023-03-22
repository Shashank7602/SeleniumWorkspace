package Assignment_11;
import java.util.Scanner;
public class maxminarray {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n Enter Size of Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("\n Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min= arr[i];
            }
        }

        System.out.println("\n Maximum Element is : " + max);
        System.out.println("\n Minimum Element is : " + min);
    }
}
