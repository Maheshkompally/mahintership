package internship;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class CommonElements {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Integer> list1 =new ArrayList<>();
		System.out.print("Enetr the number of elements in list1: ");
		int size1 = scanner.nextInt();
		System.out.println("Enter the elements of list");
		for (int i=0;i<size1;i++); {
		list1.add(scanner.nextInt());
	}
		List<Integer> list2 =new ArrayList<>();
		System.out.print("Enetr the number of elements in list2: ");
		int size2 = scanner.nextInt();
		System.out.println("Enter the elements of list2");
		for (int i=0;i<size2;i++); {
		list2.add(scanner.nextInt());
	}
		System.out.println("\nCommon elements :");
		List<Integer> commonelements = findcommonelements(list1,list2);
		System.out.println(commonelements);
		scanner.close();
}
public static List<Integer>findcommonelements(List<Integer> list1,List<Integer> list2) {
	List<Integer> commonelements = new ArrayList<>();
	for (int num : list1) {
		if (list2.contains(num)&& !commonelements.contains(num)) {
			commonelements.add(num);
		}
	}
	return commonelements;
		}
	}

	