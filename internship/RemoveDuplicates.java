package internship;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the number of elements in the list: ");
		int n=scanner.nextInt();
		List<Integer>originallist=new ArrayList<>();
		System.out.println("Enter the elements of the list:");
		for (int i=0;i<n;i++ ) {
			originallist.add(scanner.nextInt());
		}
		List<Integer> newList=removeDuplicates(originallist);
		System.out.println("New list without Duplicates:" + newList);
		scanner.close();
	}
	public static List<Integer>removeDuplicates(List<Integer>originallist) {
		Set<Integer> set = new HashSet<>(originallist);
		return new ArrayList<>(set);
	}

}
