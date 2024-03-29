package internship;
import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {

	Scanner scanner =new Scanner(System.in);
	System.out.print("Enter a string: ");
	String input = scanner.nextLine();
	boolean ispalindrome=ispalindrome(input);
	System.out.println("ispalindrome:" + ispalindrome);
	scanner.close();
	}
	public static  boolean ispalindrome(String input) {
		int left=0;
		int right=input.length()-1;
		while (left < right) {
			if (input.charAt(left) !=input.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

}
