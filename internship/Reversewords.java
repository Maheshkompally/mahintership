package internship;
import java.util.Scanner;

public class Reversewords {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a long string:");
		String userInput=scanner.nextLine();
		String reversedstring=reversedwords(userInput);
		System.out.println("Reverse string:" + reversedstring);
		scanner.close();
	}
	public static String reversedwords(String input) {
		String[] words=input.split("\\s+");
		StringBuilder reversedstring=new StringBuilder();
		for (int i=words.length-1;i>=0;i--) {
			reversedstring.append(words[i]).append(" ");
		}
		return reversedstring.toString().trim();
	}

}
