package internship;
import java.util.Scanner;

public class Distanceconverter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter distanec in kilometers");
		double kilometers = scanner.nextDouble();
		double meters = kilometersTometers(kilometers);
		System.out.println("Distance in meters"+ meters+ "meters");
		scanner.close();
		
		
	}
public static double kilometersTometers(double kilometers) {
	return kilometers*1000;
}
}
