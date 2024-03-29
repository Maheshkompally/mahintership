package internship;
import java.util.Scanner;

public class Ascendingorder {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numbers = new int[5];
		System.out.print("Enter any five numbers :");
		for (int i=0;i<5;i++) {
			numbers[i]=scanner.nextInt();
		}
		System.out.println("Ascending order :");
		printAscendingorder(numbers);
		scanner.close();
	}
 public static void printAscendingorder(int[] numbers) {
	java.util.Arrays.sort(numbers);
	for (int num : numbers) {
		System.out.print(num + " ");
	}
	System.out.println();
}
}
