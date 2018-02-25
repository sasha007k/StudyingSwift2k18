import java.io.IOException;
import java.util.Scanner;

public class mainPage {

	public static void main(String[] args) throws IOException, NumberFormatException {

		Scanner in = new Scanner(System.in);

		//// 1
		// double first;
		// double second;
		// try {
		// System.out.println("Input first: ");
		// first = in.nextDouble();
		// System.out.println("Input second: ");
		// second = in.nextDouble();
		// System.out.println("Result of division = " + div(first, second));
		// } catch (NumberFormatException e) {
		// System.out.println("NumberFormatException");
		// } catch (ArithmeticException e) {
		// System.out.println("ArithmeticException");
		// } catch (Exception e) {
		// System.out.println("Other exceptions");
		// }

		//// 2
		readNumber(1, 10, in);

		in.close();
	}

	public static double div(double first, double second) {
		return first / second;
	}

	public static void readNumber(int start, int end, Scanner in) {

		try {
			System.out.println("Input number");
			int numb = in.nextInt();
			if (numb >= start && numb <= end) {
				System.out.println(numb);
			}
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException");
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
		} catch (Exception e) {
			System.out.println("Other exceptions");
		}

	}
}