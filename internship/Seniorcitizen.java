package internship;
import java.util.Scanner;
public class Seniorcitizen {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your age");
		int age = scanner.nextInt();
		scanner.close();
		boolean isSeniorCitizen = age > 60 && age < 80;
		if (isSeniorCitizen) {
			System.out.println("your are a senior citizen");
		} else {
			System.out.println("you are not a senior citizen");
		}
		
		
	}
}
