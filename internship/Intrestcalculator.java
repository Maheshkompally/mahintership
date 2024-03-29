package internship;
import java.util.Scanner;

public class Intrestcalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter loan amount:");
		double loanamount = scanner.nextDouble();
		System.out.print("Enter the rate of intrest(in %):");
		double rateofintrest = scanner.nextDouble();
		System.out.print("Enter the time period(in years):");
		double timeperiod = scanner.nextDouble();
		scanner.close();
		double intrestamount = (loanamount*rateofintrest*timeperiod)/100;
		System.out.println("Intrest amount:" + intrestamount);
	}

}
