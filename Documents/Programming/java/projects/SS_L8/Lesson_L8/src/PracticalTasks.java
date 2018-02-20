import java.util.Scanner;
import java.util.regex.*;

public class PracticalTasks {

	public static void main(String[] args) {

		//// 1
		// String s1 = "IT Academy";
		// String s2 = "IT";
		// boolean isContain = s1.contains(s2);
		// System.out.println(isContain);

		//// 2
		// String name = "Olexandr";
		// String surname = "Kryklyvets";
		// String patronymic = "Yevhenovych";
		//
		// char ch1 = name.charAt(0);
		// char ch2 = patronymic.charAt(0);
		// System.out.println(surname + " " + ch1 + ". " + ch2 + ".");
		// System.out.println(name);
		// System.out.println(name + " " +surname);

		//// 3
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("Input username: ");
			String username = in.next();
			checkUsername(username);
		}
		in.close();
	}

	public static void checkUsername(String username) {
		Pattern p = Pattern.compile("^[A-Za-z0-9_-]{3,15}$");
		Matcher m = p.matcher(username);
		if (m.matches() == true) {
			System.out.println("Username is OK");
		} else {
			System.out.println("No such username");
		}

	}

}
