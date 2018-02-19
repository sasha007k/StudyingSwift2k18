import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HwTask2 {
	public static void main(String[] args) {

		Map<String, String> personMap = new HashMap();

		personMap.put("Ivanov", "Sasha");
		personMap.put("Petrov", "Ivan");
		personMap.put("Vasilov", "Petro");
		personMap.put("Shevchuk", "Vitalik");
		personMap.put("Kruk", "Kiril");
		personMap.put("Saak", "Nikita");
		personMap.put("Vdov", "Orest");
		personMap.put("Sergeev", "Nazar");
		personMap.put("Kindrat", "Orest");
		personMap.put("Vasylyshun", "Ivan");

		//// 1
		for (Map.Entry<String, String> entry : personMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		//// 2
		Set<String> valueSet = new HashSet(personMap.values());

		for (String obj : valueSet) {
			int count = 0;
			for (Map.Entry<String, String> entry : personMap.entrySet()) {
				if (entry.getValue().equals(obj)) {
					count++;
				}
			}
			if (count > 1) {
				System.out.println("There are " + count + " people with name " + obj);
			}
		}

		//// 3
		Set<String> toDelete = new HashSet();
		for (Map.Entry<String, String> entry : personMap.entrySet()) {
			if (entry.getValue().equals("Orest")) {
				toDelete.add(entry.getKey());
			}
		}
		for (String key : toDelete) {
			personMap.remove(key);
		}

		for (Map.Entry<String, String> entry : personMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}
}