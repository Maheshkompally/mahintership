package internship;
import java.util.Scanner;
public class SmallestNumber {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of elements in the array: ");
	        int n = scanner.nextInt();
	        int[] array = new int[n];
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < n; i++) {
	            array[i] = scanner.nextInt();
	        }
	        int smallest = findSmallestUsingLoop(array);
	        System.out.println("The smallest number in the array is: " + smallest);

	        scanner.close();
	    }
	    public static int findSmallestUsingLoop(int[] array) {
	        int smallest = array[0];
	        for (int i = 1; i < array.length; i++) {
	            if (array[i] < smallest) {
	                smallest = array[i];
	            }
	        }
	        return smallest;
	    }
	}

