package internship;
import java.util.Scanner;

public class Speedcalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter distance traveled (in KM's):");
		double distance = scanner.nextDouble();
		System.out.print("Enter time taken(in hours):");
		double time = scanner.nextDouble();
		double speed = calculateSpeed(distance, time);
		System.out.println("Speed of the vehicle" + speed+ "km/h");
		scanner.close();
		
	}
	public static double calculateSpeed(double distance, double time) {
	return distance/time;

}
}