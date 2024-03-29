package internship;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Listelements {
	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<Integer> numbers = new ArrayList<>();
    System.out.print("Enetr the number of elements in list:");
    int n = scanner.nextInt();
    System.out.print("Enter the elements of the list:");
    for (int i=0;i<n;i++) {
    	int num=scanner.nextInt();
    	numbers.add(num);
    }
    	System.out.println("\nElements less than 5 :");
    	printElementsLessThanThreshold(numbers, 5);
    	scanner.close();
    }

    	public static void printElementsLessThanThreshold(List<Integer> numbers,int threshold) {
    		for(int num : numbers) {
    			if (num < threshold) {
    				System.out.println(num + " ");
    			}
    		}
    	}
    }

