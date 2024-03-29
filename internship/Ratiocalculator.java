package internship;
import java.util.Scanner;

public class Ratiocalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first number");
		
		double number1 = scanner.nextDouble();
		System.out.print("Enter the secong number");
		double number2 = scanner.nextDouble();
		scanner.close();
		double ratio = number1/number2;
		System.out.println("Ratio of two numbers is " + ratio);
	}
	
  } 
