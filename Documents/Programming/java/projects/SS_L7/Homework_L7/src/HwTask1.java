import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HwTask1 {

	public static void main(String[] args) {

		List<String> list1 = new ArrayList<String>(Arrays.asList("A", "B", "C"));
		List<String> list2 = new ArrayList<String>(Arrays.asList("B", "C", "D", "E", "F"));

		System.out.println("List1 :");
		System.out.println(list1);
		System.out.println("List2 :");
		System.out.println(list2);

		System.out.println("Union :");
		System.out.println(new HwTask1().union(list1, list2));

		System.out.println("Intersection :");
		System.out.println(new HwTask1().intersection(list1, list2));
	}

	public <T> List<T> union(List<T> list1, List<T> list2) {
		Set<T> set = new HashSet<T>();

		set.addAll(list1);
		set.addAll(list2);

		return new ArrayList<T>(set);
	}

	public <T> List<T> intersection(List<T> list1, List<T> list2) {
		List<T> list = new ArrayList<T>();

		for (T t : list1) {
			if (list2.contains(t)) {
				list.add(t);
			}
		}
		return list;
	}
}
