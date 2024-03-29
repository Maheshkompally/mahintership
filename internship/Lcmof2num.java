package internship;
import java.util.Scanner;

public class Lcmof2num {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter any two numbers: ");
	int num1 = scanner.nextInt();
	int num2 = scanner.nextInt();
	scanner.close();
	int g =0;
	for (int i=1;i<=num1;i++) {
		if(num1%i==0&&num2%i==0)
			g=i;
	}
int lcm = num1*num2/g;
System.out.println("LCM:" +lcm);

	}
}
