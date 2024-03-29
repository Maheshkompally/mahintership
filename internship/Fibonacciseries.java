package internship;
import java.util.Scanner;

public class Fibonacciseries {
	public static void main(String[] args) {
		int term,a=0,b=1,c;
		System.out.print("Enter term");
		Scanner scanner = new Scanner(System.in);
		term = scanner.nextInt();
		scanner.close();
		for (int i=1;i<=term;i++) {
			System.out.print(a + " ");
			c=a+b;
			a=b;
			b=c;
		}
	}

}
