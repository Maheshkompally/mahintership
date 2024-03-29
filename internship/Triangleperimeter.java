package internship;
import java.util.Scanner;


public class Triangleperimeter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the lengths of the Three sides of a rectangle:");
		double side1 = scanner.nextDouble();
		double side2 = scanner.nextDouble();
		double side3 = scanner.nextDouble();
		scanner.close();
		double perimeter = calculatePerimeterFormula(side1,side2,side3);
		System.out.println("Perimeter :" + perimeter);
	}

	public static double calculatePerimeterFormula(double side1,double side2,double side3) {
		return (side1 + side2 + side3);
	}
}
