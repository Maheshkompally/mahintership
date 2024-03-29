package internship;
import java.util.Scanner;

public class Divisors {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enetr the number");
		int number = scanner.nextInt();
		scanner.close();
		System.out.println("Divisors of " + number+ " is :");
		for (int i=1;i<=number;i++) {
			if (number%i==0) {
		
		System.out.print( i + " ");
	}

}
	}
}
