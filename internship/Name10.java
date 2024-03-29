package internship;
import java.util.Scanner;

public class Name10 {
		public static void main(String [] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("enter your name:");
    	String name = scanner.nextLine();
    	scanner.close();
		int count = 0;
		while (count <10) {
			System.out.println(name);
			count++;
		}
			}

}
