import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PracticalTask2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		Map<Integer, String> mp = new HashMap();

		//// 1
		mp.put(3, "Ivan");
		mp.put(5, "Vasya");
		mp.put(2, "Sasha");
		mp.put(7, "Yura");
		mp.put(1, "Petro");
		mp.put(6, "Max");
		mp.put(4, "Nikita");

		//// 2
		// int numb;
		// System.out.println("Input ID: ");
		// numb = in.nextInt();
		// String value = (String) mp.get(numb);
		// if (mp.containsKey(numb) == true) {
		// System.out.println("Name: " + value);
		// } else {
		// System.out.println("No such ID");
		// }

		//// 3 
		String temp;
		System.out.println("Input name: ");
		temp = in.next();
		if (mp.containsValue(temp) == true) {
			System.out.println("ID: " + getKeyFromValue(mp, temp));
		} else {
			System.out.println("No such name");
		}

		in.close();
	}

	public static Object getKeyFromValue(Map hm, Object value) {
		for (Object o : hm.keySet()) {
			if (hm.get(o).equals(value)) {
				return o;
			}
		}
		return null;
	}

}
