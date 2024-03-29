package internship;
import java.util.ArrayList;
import java.util.List;

public class FirstandLastElement {
	public static void main(String[] args) {
	List<Integer> num = new ArrayList<>();
	num.add(5);
	num.add(10);
	num.add(15);
	num.add(20);
	num.add(25);
	List<Integer>firstandlast =extractFirstAndLastElements(num);
	System.out.println("original list: " + num);
	System.out.println("New List: " + firstandlast );
	}
public static List<Integer>extractFirstAndLastElements(List<Integer>num) {
	List<Integer>result=new ArrayList<>();
	if (!num.isEmpty()) {
		result.add(num.get(0));
		if (num.size()>1) {
			result.add(num.get(num.size() -1));
		}
	}
	return result;
}
}
