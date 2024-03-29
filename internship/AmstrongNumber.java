package internship;
import java.util.Scanner;

public class AmstrongNumber {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a number:");
		int number = scanner.nextInt();
		boolean isarmstrong=isarmstrongnumber(number);
		if (isarmstrong) {
			System.out.println(number + " is an armstrong number.");
		} else {
			System.out.println(number + " is not an  armstrong number.");
		}
		scanner.close(); 
	}
	public static boolean isarmstrongnumber(int number) {
		int originalnumber=number;
		int sum=0;
		int numdigits =String.valueOf(number).length();
		while (number > 0) {
			int digit = number%10;
			sum += Math.pow(digit, numdigits);
			number /=10;
		}
		return originalnumber == sum;
	}
 }
