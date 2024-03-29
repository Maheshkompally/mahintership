package internship;
import java.util.Scanner;

public class ProfitCalculator { 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ënter the cost price:");
		double costprice = scanner.nextDouble();
		System.out.print("Enter the selling price:");
		double sellingprice = scanner.nextDouble();
		double profit = calculateprofit(costprice,sellingprice);
		System.out.println("Profit: "+ profit);
		scanner.close();
		
	}
public static double calculateprofit(double costprice, double sellingprice) {
return sellingprice-costprice;
}



}
