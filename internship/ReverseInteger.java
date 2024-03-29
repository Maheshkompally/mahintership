package internship;
	import java.util.Scanner;
	public class ReverseInteger {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter an integer: ");
	        int number = scanner.nextInt();
	        int reversedNumber = reverseIntegerUsingArithmetic(number);
	        System.out.println("Reversed integer: " + reversedNumber);
	        scanner.close();
	    }

	    public static int reverseIntegerUsingArithmetic(int number) {
	        int reversedNumber = 0;
	        while (number != 0) {
	            int digit = number % 10;
	            reversedNumber = reversedNumber * 10 + digit;
	            number /= 10;
	        }
	        return reversedNumber;
	    }
	}


