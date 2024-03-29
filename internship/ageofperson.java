package internship;

import java.util.Scanner;
import java.time.Year;


public class ageofperson {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();
        int currentyear =Year.now().getValue();
        int age = currentyear - birthYear;
        System.out.println("Your age is: " + age);
        scanner.close();
    }
}