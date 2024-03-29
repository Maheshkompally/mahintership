package internship;
import java.util.Scanner;

public class EvenoddChecker {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number");
		int num = scanner.nextInt();
		scanner.close();
		if (num % 2 == 0) {
			System.out.println("Given number is even:" + num);
		} else {
			System.out.println("Given number is odd: " + num);
		}
		}
	}


