import java.util.Scanner;

public class L4_main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		//// 1
		// int [] mas = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		// int numberMonth;
		// System.out.println("Input month: ");
		// numberMonth = in.nextInt();
		// System.out.println(mas[numberMonth - 1]);

		//// 2
		// int[] mas = { 2, 4, 3, 1, -9, 6, 1, 8, 4, -2 };
		// int sum = 0;
		// int mult = 1;
		// boolean result = false;
		// for (int i = 0; i < mas.length / 2; i++) {
		// if (mas[i] > 0) {
		// result = true;
		// } else {
		// result = false;
		// break;
		// }
		// }
		// for (int i = 0; i < mas.length;) {
		// if (result == true) {
		// for (int j = 0; j < mas.length / 2; j++) {
		// sum += mas[j];
		// }
		// System.out.println("Sum = " + sum);
		// break;
		// } else {
		// for (int m = mas.length / 2; m < mas.length; m++) {
		// mult *= mas[m];
		// }
		// System.out.println("Mult = " + mult);
		// break;
		// }
		// }

		//// 3
		// int[] mas = { 3, -1, -4, 7, 1 };
		// int cp = 0;
		// for (int i = 0; i < mas.length; i++) {
		// if (mas[i] > 0) {
		// cp++;
		// if (cp == 2) {
		// System.out.println("Position in array of second positive number: ");
		// System.out.println(i);
		// break;
		// }
		// }
		// }
		// int min = mas[0];
		// int cm = 0;
		// for (int i = 0; i < mas.length; i++) {
		// if (min > mas[i]) {
		// min = mas[i];
		// }
		// }
		// System.out.println("Minimum in the array: ");
		// System.out.println(min);
		// for (int i = 0; i < mas.length; i++) {
		//
		// if (mas[i] == min) {
		// break;
		// }
		// else cm++;
		//
		// }
		// System.out.println("Position in the array of minium: ");
		// System.out.println(cm);

		//// 4
		// int numb;
		// int sum = 0;
		// System.out.println("Input numbers: ");
		// do {
		// numb = in.nextInt();
		// if (numb > 0) {
		// sum += numb;
		// }
		// } while (numb > 0);
		// System.out.println("Sum = " + sum);

		//// 5
		 Car [] mas = new Car [4];
		 Car cr = new Car();
		 cr.setInfo(mas);
		// cr.showWithYear(mas);
		 cr.sortWithYear(mas);

		in.close();
	}

}
