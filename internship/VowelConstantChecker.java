package internship;
import java.util.Scanner;

public class VowelConstantChecker {
	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.print("Enter a Character:");
	char ch=scanner.next().charAt(0);
	boolean isVowel=checkvowel(ch);
	if (isVowel) {
		System.out.println(ch + " is a vowel.");
	} else {
		System.out.println(ch + " is a constant.");
	}
	scanner.close();

}
public static boolean checkvowel(char ch) {
	char[] vowels= {'a','e','i','o','u'};
	char lowercasech=Character.toLowerCase(ch);
	for (char vowel : vowels) {
		if (lowercasech==vowel) {
			return true;
		}
	}
	return false;
}
}
