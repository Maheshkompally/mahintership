package internship;
import java.util.Scanner;
public class LargestofThree {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter three numbers:");
		double num1=scanner.nextDouble();
		double num2=scanner.nextDouble();
		double num3=scanner.nextDouble();
		double large=findlargest(num1,num2,num3);
		System.out.println("The largest number is: " + large);
		scanner.close();
	}
	public static double findlargest(double num1,double num2,double num3) {
	double large;
	if (num1>=num2 && num1>=num3) {
		large=num1;
	}else if (num2 >= num1 && num2 >= num3) {
		large=num2;
	}  else {
		large=num3;
	}
	
return large;

}
}
 