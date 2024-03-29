package internship;
import java.util.Scanner;

public class Yeartoweeks {
	public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int years,weeks;
    System.out.println("Enter number of years:");
    years = sc.nextInt();
    sc.close();
    weeks = years*52;
    System.out.println("years to weeks:"  + weeks);
	}
}
    

