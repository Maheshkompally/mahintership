package internship;
import java.util.Scanner;

public class Fahrenheit {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter temperature in celcius:");
	double celsius = scanner.nextDouble();
	double fahrenheit = celsiusToFahrenheit(celsius);
	System.out.println("Temperature in Fahrenheit:" + fahrenheit);
	scanner.close();
	}
	public static double celsiusToFahrenheit(double celsius) {
		return (9.0/5.0)* celsius+32;
	}

}
