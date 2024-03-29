package internship;
import java.util.Scanner;

public class heightincm {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your height:");
		System.out.println("1.Meters");
		System.out.println("2.Feet");
		System.out.println("3.inches");
		System.out.print("choose an option: ");
		int option = scanner.nextInt();
		double heightincentimeters = 0;
		switch (option) {
		case 1:
			System.out.print("Enter height in meters: ");
		double meters = scanner.nextDouble();
		heightincentimeters = convertmeterstocentimeters(meters);
		break;
		case 2:
			System.out.print("Enter height in feets: ");
			double feets = scanner.nextDouble();
			heightincentimeters = convertfeetstocentimeters(feets);
			break;
		case 3:
			System.out.print("Enter height in meters: ");
			double inches = scanner.nextDouble();
			heightincentimeters = convertinchestocentimeters(inches);
			break;
			default:
				System.out.println("Invalid option");
				System.exit(0);
		}
				System.out.println("Height in centimeters: " + heightincentimeters+" cm");
				scanner.close();
		}
				public static double convertmeterstocentimeters(double meters) {
					return meters*100;
				}
					public static double convertfeetstocentimeters(double feets) {
	                return feets*30.48;
					}
	                public static double convertinchestocentimeters(double inches) {
                    return inches*2.54;
				}
					}
			



