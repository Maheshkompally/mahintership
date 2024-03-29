package internship;
import java.util.Scanner;

public class rectanglearea {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter the length of the rectangle");
		double length = scanner.nextDouble();
		System.out.print("enter the width of the rectangle");
		double width = scanner.nextDouble();
				scanner.close();
		double area = length*width;
		System.out.println("Area of the rectangle:"+area);
		
	}
	

}
