import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HwL8 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		//// 1
		// String s;
		// s = in.nextLine();
		// System.out.println("Sentence: " + s);

		// String x = "", maxw = "";
		// int p, maxl = 0;
		// StringTokenizer str = new StringTokenizer(s, ";?'. :,");
		// int c = str.countTokens();
		// for (int i = 0; i < c; i++) {
		// x = str.nextToken();
		// p = x.length();
		// if (p > maxl)
		// {
		// maxl = p;
		// maxw = x;
		// }
		// }
		// System.out.println("The longest word: " + maxw);
		//
		// char[] el = s.toCharArray();
		// for(int i = 0; i < s.length(); i++)
		// {
		// System.out.println("The letter " + i + " is " + el[i]);
		// }

		// StringBuilder sb = new StringBuilder(s);
		// sb.reverse();
		// for (int i = 0; i < s.length(); i++) {
		// if (el[i] == ' ') {
		// do {
		// System.out.print(sb.charAt(i));
		// } while (el[i] != ' ');
		// }
		// }

		//// 2
//		String st = "I      am       learning           Java       Core";
//		while (st.contains("  ")) {
//			st = st.replace("  ", " ");
//		}
//		System.out.println(st);
		
		////3
		for (int i = 0; i < 5; i++) {
			System.out.println("Input currency (it has contain $ at the beggining): ");
			String currency = in.next();
			checkcCurrency(currency);
		}
		in.close();
	}

	public static void checkcCurrency(String currency) {
		Pattern p = Pattern.compile("\\$(\\d*)(\\.\\d{2})?");
		Matcher m = p.matcher(currency);
		if (m.matches() == true) {
			System.out.println("Currency is OK");
		} else {
			System.out.println("No such currency");
		}

	}

}
