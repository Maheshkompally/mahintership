package internship;
import java.util.Scanner;

public class Agecalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = scanner.nextLine();
		System.out.print("Enter your age :");
		int age = scanner.nextInt();
		scanner.close();
		int currentyear = java.time.Year.now().getValue();
		int Yearstoturnhundred = currentyear+(100-age);
		System.out.println( "Hello "  + name   + Yearstoturnhundred );
	}

}
